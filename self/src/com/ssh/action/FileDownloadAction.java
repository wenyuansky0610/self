package com.ssh.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.UpLoadModel;
import com.ssh.service.UpLoadService;
import com.ssh.util.Base64;

public class FileDownloadAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4929715306801840729L;
	private String fileName;
	private String path;
	private String postid;
	private UpLoadService upLoadService;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPostid() {
		return postid;
	}

	public void setPostid(String postid) {
		this.postid = postid;
	}

	public UpLoadService getUpLoadService() {
		return upLoadService;
	}

	public void setUpLoadService(UpLoadService upLoadService) {
		this.upLoadService = upLoadService;
	}

	public InputStream getDownloadFile() throws Exception {

		UpLoadModel loadModel = upLoadService.getUpLoadModelbyID(postid);
		fileName = loadModel.getFileType();
		File file = new File(loadModel.getPath());
		try {
			InputStream is = new FileInputStream(file);
			return is;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getDownFileName() throws Exception {
		// 需要进行中文编码
		try {
			fileName = fileName.replace("[", "");
			fileName = fileName.replace("]", "");
			fileName = URLEncoder.encode(fileName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		return fileName;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getEncoding(String str) {
		String encode = "GB2312";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s = encode;
				return s;
			}
		} catch (Exception exception) {
		}
		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s1 = encode;
				return s1;
			}
		} catch (Exception exception1) {
		}
		encode = "UTF-8";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s2 = encode;
				return s2;
			}
		} catch (Exception exception2) {
		}
		encode = "GBK";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s3 = encode;
				return s3;
			}
		} catch (Exception exception3) {
		}
		return "";
	}
}