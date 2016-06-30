package com.ssh.service;

import com.ssh.dao.BaseDAO;
import com.ssh.model.UpLoadModel;
import com.ssh.model.UserModel;

public class UpLoadServiceImpl implements UpLoadService {
	private BaseDAO<UpLoadModel> baseDAO;
	@Override
	public void saveUpLoad(UpLoadModel loadModel) {
		
		   baseDAO.save(loadModel);  
	}
	public void setBaseDAO(BaseDAO<UpLoadModel> baseDAO) {
		this.baseDAO = baseDAO;
	}
    public BaseDAO<UpLoadModel> getBaseDAO() {
		return baseDAO;
	}

}