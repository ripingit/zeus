package org.chaoxuan.zeus.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.io.IOUtils;
import org.chaoxuan.util.PropUtil;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class BaseController {
    public void json(HttpServletResponse response, Object object) {
        try {
            String json = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss", SerializerFeature.DisableCircularReferenceDetect);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void jsonWithOutDateFormat(HttpServletResponse response, Object object) {
        try {
            String json = JSON.toJSONString(object);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void json(HttpServletResponse response, String format, Object object) {
        try {
            String json = JSON.toJSONStringWithDateFormat(object, format, SerializerFeature.DisableCircularReferenceDetect);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @author Yurnero
     * @date 2017/5/18
     * @description 文件上传
     */
    public String upload(HttpServletRequest request) throws IllegalStateException, IOException {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        if (multipartResolver.isMultipart(request)) {// 检查form中是否有enctype="multipart/form-data"
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;// 将request变成多部分request
            Iterator<String> its = multiRequest.getFileNames();// 获取multiRequest 中所有的文件名
            while (its.hasNext()) {// 循环遍历
                String str = its.next();
                MultipartFile file = multiRequest.getFile(str);
                if (file != null && file.getSize() > 0) {

                    String mime = "";
                    String contentType = file.getContentType();

                    if (contentType != null && contentType.contains("image")) {
                        mime = "image";
                    } else if (contentType != null && contentType.contains("video")) {
                        mime = "video";
                    } else {
                        mime = "other";
                    }

                    String filePath = PropUtil.getProperty("config/common.properties", "filePath");// 文件存放的根路径
                    String folder = new SimpleDateFormat("yyyyMMdd").format(new Date());// 文件夹名
                    String oldFileName = file.getOriginalFilename();// 旧文件名
                    String newFileName = UUID.randomUUID().toString().replace("-", "").toUpperCase() + oldFileName.substring(oldFileName.lastIndexOf("."));// 新文件名

                    // 创建文件夹
                    File f = new File(filePath + folder);
                    if (!f.exists()) {
                        f.mkdirs();
                    }

                    // 保存文件
                    file.transferTo(new File(filePath + folder + "/" + newFileName));

                    // 返回 json
                    Map<String, String> map = new HashMap<String, String>();
                    map.put("oldFileName", oldFileName);
                    map.put("newFileName", newFileName);
                    map.put("url", folder + "/" + newFileName);
                    map.put("mime", mime);
                    map.put("describe", "");
                    list.add(map);
                }
            }
        }

        if (list.size() == 1) {
            return JSON.toJSONString(list.get(0));
        }
        return JSON.toJSONString(list);
    }

    public void download(HttpServletRequest request, HttpServletResponse response, String fileUrl, String oldFileName) {
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        try {
            response.reset();
            fileUrl = PropUtil.getProperty("config/common.properties", "filePath") + fileUrl;
            File file = new File(fileUrl);
            if (!file.isFile()) {
                return;
            }
            input = new BufferedInputStream(new FileInputStream(file));
            oldFileName = new String(oldFileName.getBytes("GBK"), "ISO8859-1");
            response.addHeader("Content-Disposition", "attachment;filename=" + oldFileName);
            response.addHeader("Content-Length", "" + file.length());
            response.setContentType("application/octet-stream");
            output = new BufferedOutputStream(response.getOutputStream());
            IOUtils.copy(input, output);
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
