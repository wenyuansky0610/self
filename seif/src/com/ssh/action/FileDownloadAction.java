package com.ssh.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport
{
    public InputStream getDownloadFile()
    {
        return ServletActionContext.getServletContext().getResourceAsStream("upload/ͨѶ¼2012��9��4��.xls");
    }
    
    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }
}