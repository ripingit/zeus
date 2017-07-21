package org.chaoxuan.zeus.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author Yurnero
 * @Date 2017年3月21日
 * @Description MD5 加密工具类
 */
public class Encrypt {


	/**
	 * @Author Yurnero
	 * @Date 2017年3月21日
	 * @param inputText
	 * @return String
	 * @Description MD5 加密
	 */
	public static String e(String inputText) {
		return md5(inputText);
	}

	/**
	 * @Author Yurnero
	 * @Date 2017年3月21日
	 * @param inputText
	 * @return String
	 * @Description sha-1 加密
	 */
	public static String md5AndSha(String inputText) {
		return sha(md5(inputText));
	}

	
	private static String md5(String inputText) {
		return encrypt(inputText, "md5");
	}

	
	private static String sha(String inputText) {
		return encrypt(inputText, "sha-1");
	}

	
	private static String encrypt(String inputText, String algorithmName) {
		if (inputText == null || "".equals(inputText.trim())) {
			throw new IllegalArgumentException("请输入要加密的内容 !");
		}
		if (algorithmName == null || "".equals(algorithmName.trim())) {
			algorithmName = "md5";
		}
		String encryptText = null;
		try {
			MessageDigest m = MessageDigest.getInstance(algorithmName);
			m.update(inputText.getBytes("UTF8"));
			byte s[] = m.digest();
			// m.digest(inputText.getBytes("UTF8"));
			return hex(s);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return encryptText;
	}

	
	private static String hex(byte[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; ++i) {
			sb.append(Integer.toHexString((arr[i] & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString();
	}
	
	/**
	 * @Author Yurnero
	 * @Date 2017年3月21日
	 * @param args void
	 * @Description 测试 MD5
	 */
	public static void main(String[] args) {
		// md5加密测试
		String md5_1 = md5("123456");
		String md5_2 = md5("超选");
		System.out.println(md5_1 + "\n" + md5_2);
		// sha加密测试
		String sha_1 = sha("123456");
		String sha_2 = sha("超选");
		System.out.println(sha_1 + "\n" + sha_2);
	}
}
