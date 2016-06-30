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
<link rel="stylesheet" type="text/css"
	href="/seif/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="/seif/css/theme.css">
<link rel="stylesheet" href="/seif/font-awesome/css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="/seif/css/login.css">
<script src="/seif/js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="/seif/bootstrap/js/bootstrap.js"></script>
</head>


<body class="back_img">
	<div class="navbar">
		<div class="navbar-inner">
			<button type="button" class="btn btn-primary" data-toggle="collapse"
				data-target="#demo">登 录</button>
		</div>
	</div>


	<div id="demo" class="collapse">
		<div class="container" style="margin-top: 100px">
			<form class="form-signin" action="loginPro" method="post">
				<div class="page-header">
					<h2>SEIF</h2>
				</div>
				<input type="text" class="input-block-level" placeholder="用户名"
					name="userName"> <input type="password"
					class="input-block-level" placeholder="密码" name="userPass">
				<button class="btn  btn-primary" name="register_Do" type="submit">登陆</button>
				<button class="btn" type="reset" name="resrt_Do">重置</button>
			</form>
		</div>
	</div>
</body>
</html>
