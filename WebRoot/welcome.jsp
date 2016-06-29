<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>SEIF</title>
</head>

<body>
	<span style="color: blue; size: 15;">${msg}</span>
	<a href="http://www.baidu.com/s?wd=java">百度</a>
	<a href="http://www.youku.com/">优酷</a>
	<a href="http://www.jd.com/">京东</a>
	<a href="http://www.bttiantang.com/">BT天堂（电影下载地址）</a>
</body>
</html>
