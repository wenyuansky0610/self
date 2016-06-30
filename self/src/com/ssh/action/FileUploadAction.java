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
    
  //ע�⣬file������ָǰ��jsp�ϴ��������ļ����������ļ��ϴ������������ʱ�ļ���������ļ�
    private File file;
    
    //�ύ������file������
    private String fileFileName;
    
    //�ύ������file��MIME����
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
        // ��Ϊfile�Ǵ������ʱ�ļ��е��ļ������ǿ��Խ����ļ������ļ�·����ӡ����������֮ǰ��fileFileName�Ƿ���ͬ
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