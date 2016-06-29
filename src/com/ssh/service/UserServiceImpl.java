package com.ssh.service;

import java.util.List;

import com.ssh.dao.BaseDAO;
import com.ssh.model.UserModel;

public class UserServiceImpl implements UserService {

	private BaseDAO<UserModel> baseDAO;
	  
    public BaseDAO<UserModel> getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO<UserModel> baseDAO) {
		this.baseDAO = baseDAO;
	}

	@Override  
    public void saveUser(UserModel user) {  
        baseDAO.save(user);  
    }  
  
    @Override  
    public void updateUser(UserModel user) {  
        baseDAO.update(user);  
    }  
  
    @Override  
    public UserModel findUserById(int id) {  
        return baseDAO.get(UserModel.class, id);  
    }  
  
    @Override  
    public void deleteUser(UserModel user) {  
        baseDAO.delete(user);  
    }  
  
    @Override  
    public List<UserModel> findAllList() {  
        return baseDAO.find(" from UserModel u order by u.createTime");  
    }  
  
    @Override  
    public UserModel findUserByNameAndPassword(String username, String password) {  
        return baseDAO.get(" from UserModel u where u.name = ? and u.password = ? ", new Object[] { username, password });  
    }

	@Override
	public List<String> findIp() {
		// TODO Auto-generated method stub
		 List<String> findIp = baseDAO.findIp("select ip from UserModel");
		return findIp;
	}

}
