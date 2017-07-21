package org.chaoxuan.zeus.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.chaoxuan.zeus.model.Worker;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class WorkerInterceptor implements HandlerInterceptor {

    // 最终拦截, 视图已经解析完毕, 监控一些异常,
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception exception) throws Exception {
        // System.out.println("afterConpletion");
    }

    // 后置拦截, 可以给使用当前拦截器的追加一些东西, Controller 执行完, 但是视图解析器没有解析成页面,
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav) throws Exception {
        /*System.out.println("postHandle");
        Map<String, Object> map = mav.getModel();
		map.put("test", "append something");*/
    }

    // 前置拦截, Controller 执行前,
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        return request.getSession().getAttribute("worker") != null;
    }
}
