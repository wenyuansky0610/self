package com.ssh.model;

import java.util.Date;

public class UpLoadModel {
	private String id;
	private String fileName;
	private String path;
	private Date upLoadTime;

	public UpLoadModel() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getUpLoadTime() {
		return upLoadTime;
	}

	public void setUpLoadTime(Date upLoadTime) {
		this.upLoadTime = upLoadTime;
	}


}
