package com.ssh.service;

import java.util.List;

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
	@Override
	public List<UpLoadModel> getUpLoadModels(int rownum) {
		return baseDAO.findTopRownum("from UpLoadModel order by upLoadTime desc",rownum);
	}
	@Override
	public UpLoadModel getUpLoadModelbyID(String id) {
		List<UpLoadModel> find = baseDAO.find("from UpLoadModel where postId='"+id+"'");
		if(find.isEmpty()){
			
			return null;
		}
		return find.get(0);
	}

}
