package com.ssh.util;
 
import java.security.MessageDigest;   
  
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import sun.misc.BASE64Encoder;  
  
/** 
 * 通用工具类 
 */  
public class Util {  
  
    /** 
     * 对字符串进行MD5加密 
     *  
     * @param str 
     * @return String 
     */  
    public static String md5Encryption(String str) {  
        String newStr = null;  
        try {  
            MessageDigest md5 = MessageDigest.getInstance("MD5");  
            BASE64Encoder base = new BASE64Encoder();  
            newStr = base.encode(md5.digest(str.getBytes("UTF-8")));  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return newStr;  
    }  
      
  
    /** 
     * 判断字符串是否为空 
     *  
     * @param str 
     *            字符串 
     * @return true：为空； false：非空 
     */  
    public static boolean isNull(String str) {  
        if (str != null && !str.trim().equals("")) {  
            return false;  
        } else {  
            return true;  
        }  
    }  
    /**
     * 格式化当前时间
     * @return
     * @throws ParseException
     */
    public static Date getFormatDate() throws ParseException {
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = time.format(new Date());
        SimpleDateFormat time1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = time1.parse(format);
		return parse;
	}
	/**
	 * 格式化时间 
	 * @param date 
	 * @return
	 * @throws ParseException
	 */
    public static Date getFormatDate(Date date) throws ParseException{
    	
    	SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = time.format(date);
        SimpleDateFormat time1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = time1.parse(format);
		return parse;
    }
    /**
     * 获取全路径
     * @param request
     * @return
     */
    public static String getBasePath(HttpServletRequest request) {
		String path = request.getContextPath();
    	String basePath = request.getScheme() + "://"
    			+ request.getServerName() + ":" + request.getServerPort()
    			+ path + "/";
		return basePath;
	}
    /**
     * 
     * @return
     */
    public static String getPostID(){
    	
    	Date date = new Date();
    	long time = date.getTime();
    	return time+"";
    }
}
