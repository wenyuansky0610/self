<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
</head>

<body>
	<div id="screen">
		<div id="command">

			<h1>The meaning of itself</h1>
			人心如魔，欲望似鬼！
			<div id="bar"></div>
		</div>
		<div id="urlInfo"></div>
		<div id="box2"><a  href="http://www.miitbeian.gov.cn/" target="_black"><span style="color:red">粤ICP备16059245号-1</span><a></div>
		
	</div>

	<script type="text/javascript">
		/* ==== start script ==== */
		
		
		setTimeout(function() {
			m3D.init([
			{ src: 'sc.jpg',title : '<b style="color:red">上传</b>',url:'<%=basePath%>upload.jsp' },
			{ src: 'xz.png',title : '<b style="color:red">下载</b>',url:'<%=basePath%>queryLists?rownum=5' },
			{ src: 'yzbj2.jpg',title : '星际' }
			]);
		}, 300);
	</script>
</body>
</html>
