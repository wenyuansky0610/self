<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<base href="<%=basePath%>">
<title>Self</title>
<link rel="icon" href="images/time.ico" />
<link rel="stylesheet" type="text/css" href="css/index.css">
<script src="js/index.js" type="text/javascript"></script>
<script src="js/download.js" type="text/javascript"></script>
<script src="js/jquery-1.12.1.min.js" type="text/javascript"></script>
</head>

<body>
	<div class="nav">
		<div class="nav_li">
			<ul>
				<li> <a href="<%=basePath%>index.jsp">首页</a></li>
				<li><a href="<%=basePath%>upload.jsp">文件上传</a></li>
				<li><a href="http://music.163.com/#/playlist?id=40462805" target="_black"><b>网易云音乐歌单</b></a></li>
				<li><a href="<%=basePath%>queryLists?rownum=10">文件下载</a></li>
				<li><a href="<%=basePath%>index.jsp">其他</a></li>
			</ul>
		</div>
	</div>
	<div id="screen">
		<div id="command">

			<h1>
				<a href="<%=basePath%>index.jsp">The meaning of itself</a></a>
			</h1>
			人心如魔，欲望似鬼！
			<div id="bar"></div>
		</div>
		<div id="urlInfo"></div>
		<center id="upload">
			<table align = "center" border="1" width="500px" id="lab" >
			<tr>
<!-- 			<th></th> -->
			  <th>文件名称</th>
			  <th>上传时间</th>
			  <th>操作</th>
			</tr>
			<c:forEach items="${upLoadModels}" var="ups" varStatus="vs">
		<tr onmouseover="over_color(this)" onmouseout="remove_color(this)" onclick="click_color(this)" class="tr-color cursor">
<!-- 			 <td><input type="checkbox" name="fxk" onclick="check(this)"/></td> -->
			 <td align = "left">${ups.fileName}</td>
			 <td align = "center">${ups.upLoadTime}</td>
			 <td align = "center"><a href="${ups.url}" style="color:red">下载</a></td> <!-- 自定义标签 -->
		 </tr>
		 </c:forEach>
		 </table>
       
			
		</center>
		
		<div id="box2"><a  href="http://www.miitbeian.gov.cn/" target="_black"><span style="color:red">粤ICP备16059245号-1</span></a></div>
	</div>

</body>
</html>
