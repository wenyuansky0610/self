package com.ssh.service;

import java.util.List;

import com.ssh.model.UserModel;

public interface UserService {

	public void saveUser(UserModel user);  
    
    public void updateUser(UserModel user);  
      
    public UserModel findUserById(int id);  
      
    public void deleteUser(UserModel user);  
      
    public List<UserModel> findAllList(); 
    
    public List<String> findIp();
    
    public UserModel findUserByNameAndPassword(String username, String password);
}
