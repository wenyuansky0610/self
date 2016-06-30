package com.ssh.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.UpLoadModel;
import com.ssh.service.UpLoadService;

public class FileUploadAction extends ActionSupport
{
    private String username;
    
  //注意，file并不是指前端jsp上传过来的文件本身，而是文件上传过来存放在临时文件夹下面的文件
    private File file;
    
    //提交过来的file的名字
    private String fileFileName;
    
    //提交过来的file的MIME类型
    private String fileContentType;

    private UpLoadService upLoadService;
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public File getFile()
    {
        return file;
    }

    public void setFile(File file)
    {
        this.file = file;
    }

    public String getFileFileName()
    {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName)
    {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType()
    {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType)
    {
        this.fileContentType = fileContentType;
    }
    
    public void setUpLoadService(UpLoadService upLoadService) {
		this.upLoadService = upLoadService;
	}

	@Override
    public String execute() throws Exception
    {
        String root ="C:/file/";
        
        File file3=new File("C:\\file\\"+file.getName());  
        if(!file3.exists())  
        {  
        	
        InputStream is = new FileInputStream(file);
        
        File file2 = new File(root, fileFileName);
		OutputStream os = new FileOutputStream(file2);
        
        System.out.println("fileFileName: " + fileFileName);
        // 因为file是存放在临时文件夹的文件，我们可以将其文件名和文件路径打印出来，看和之前的fileFileName是否相同
        System.out.println("file: " + file.getName());
        System.out.println("file: " + file.getPath());
        UpLoadModel loadModel = new UpLoadModel();
        loadModel.setFileName(username);
        loadModel.setPath(file2.getPath());
        loadModel.setUpLoadTime(new Date());
		upLoadService.saveUpLoad(loadModel);
        byte[] buffer = new byte[500];
        int length = 0;
        
        while(-1 != (length = is.read(buffer, 0, buffer.length)))
        {
            os.write(buffer);
        }
        
        os.close();
        is.close();
        }  
        return SUCCESS;
    }
}