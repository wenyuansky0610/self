package com.ssh.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.util.Base64;

public class FileDownloadAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4929715306801840729L;
	private String fileName;
	private String path;

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

	public InputStream getDownloadFile() throws Exception {
		
		String decrypt = Base64.decode(path);
		System.out.println(decrypt);
		File file = new File(decrypt);
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
		   fileName = URLEncoder.encode(Base64.decode(fileName), "UTF-8");
		  } catch (UnsupportedEncodingException e) {
		   throw new RuntimeException(e);
		  }
		  return fileName;
		 }

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}