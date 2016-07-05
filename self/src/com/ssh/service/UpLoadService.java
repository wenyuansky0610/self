package com.ssh.service;


import java.util.List;

import com.ssh.model.UpLoadModel;

public interface UpLoadService {
  public void saveUpLoad(UpLoadModel loadModel);
  
  public UpLoadModel getUpLoadModelbyID(String id);
  
  public List<UpLoadModel> getUpLoadModels(int rownum);
}
