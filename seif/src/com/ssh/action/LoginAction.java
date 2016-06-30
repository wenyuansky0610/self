package com.ssh.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.ssh.model.UserModel;
import com.ssh.service.UserService;

public class LoginAction implements Action {

	// 登录用户的账户和密码
	private String userName;
	private String userPass;

	private UserService userService;
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String loginDo() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String remoteAddr = getIpAddr(request);
		try {
			UserModel user = userService.findUserByNameAndPassword(userName, userPass);
			List<String> findIp = userService.findIp();

			if (user == null) {
				if (findIp.contains(remoteAddr)) {
					request.setAttribute("msg", "数据库中存在相同的IP地址，无法创建用户（一个IP只能创建一次）");
					return SUCCESS;
				}
				UserModel userModel = new UserModel();
				userModel.setName(userName);
				userModel.setPassword(userPass);
				userModel.setCreateTime(new Date());
				userModel.setIp(remoteAddr);
				userService.saveUser(userModel);
				request.setAttribute("msg", "用户【" + userName + "】创建、登录成功。IP:" + remoteAddr);
			}

			else {
				if (user.getPassword() != null && !user.getPassword().equals(userPass)) {

					request.setAttribute("msg", "用户【" + userName + "】密码错误");
					return SUCCESS;
				}
				request.setAttribute("msg", "用户【" + userName + "】登录成功。IP:" + remoteAddr);
			}
			request.setAttribute("ips",findIp );
			return SUCCESS;
		} catch (Exception e) {
			request.setAttribute("msg", "登录失败");
			return ERROR;
		}
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 通过HttpServletRequest返回IP地址
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @return ip String
	 * @throws Exception
	 */
	public String getIpAddr(HttpServletRequest request) throws Exception {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}
