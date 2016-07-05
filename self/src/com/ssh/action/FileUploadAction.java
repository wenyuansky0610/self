package com.ssh.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.UpLoadModel;
import com.ssh.service.UpLoadService;
import com.ssh.util.Base64;
import com.ssh.util.Util;

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
    
    private int rownum=5;
    
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
    	HttpServletRequest request = ServletActionContext.getRequest();
        File file3=new File("C:\\file\\"+file.getName());  
        if(file3.exists())  {
        	
        	file3.delete();
        	
        }
        InputStream is = new FileInputStream(file);
        
        File file2 = new File(root, fileFileName);
		OutputStream os = new FileOutputStream(file2);
        
        // ��Ϊfile�Ǵ������ʱ�ļ��е��ļ������ǿ��Խ����ļ������ļ�·����ӡ����������֮ǰ��fileFileName�Ƿ���ͬ
        UpLoadModel loadModel = new UpLoadModel();
        if(null==username||username.isEmpty()){
        	
        	username=fileFileName;
        }
        loadModel.setFileName(username);
		loadModel.setFileType(fileFileName);
        String filePath = file2.getPath();
		String encryptFilePath = Base64.encode(filePath);
		String encodeFileFileName = Base64.encode(fileFileName);
		loadModel.setPath(filePath);
        loadModel.setUpLoadTime(Util.getFormatDate());
        String basePath = Util.getBasePath(request);
		loadModel.setUrl(basePath+"download.action?path="+encryptFilePath+"&fileName="+encodeFileFileName);
		upLoadService.saveUpLoad(loadModel);
        byte[] buffer = new byte[500];
        int length = 0;
        
        while(-1 != (length = is.read(buffer, 0, buffer.length)))
        {
            os.write(buffer);
        }
        
        os.close();
        is.close();
        
        queryFiles();
		return SUCCESS;
    }



	public String queryFiles() throws ParseException{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		List<UpLoadModel> upLoadModels = upLoadService.getUpLoadModels(rownum);
		request.setAttribute("upLoadModels",upLoadModels);
		return SUCCESS;
	}
}