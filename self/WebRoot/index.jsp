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
<script src="js/jquery-1.12.1.min.js" type="text/javascript"></script>
<script src="js/index.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/nav.css">
</head>

<body>
<article class="zzsc">

	<div class="main-container">
		<button class="btn" id="b1"  >首页</button>
		<button id="b2" class="btn"  >上传</button>
		<button id="b3" class="btn"  >下载</button>
		<button id="b4" class="btn"  >其他</button>
	</div>

</article>
	<div id="screen">

		<div id="command">

			<h1>The meaning of itself</h1>
			人心如魔，欲望似鬼！
			<div id="bar"></div>
		</div>
		<div id="urlInfo"></div>
		<div id="box2"><a  href="http://www.miitbeian.gov.cn/" target="_black"><span style="color:red">粤ICP备16059245号-1</span><a></div>
		
	</div>
<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script  src="js/waterFloat.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		var b1 = $('#b1');
		var b2 = $('#b2');
		var b3 = $('#b3');
		var b4 = $('#b4'); 
		var b5 = $('#b5');
		var b6 = $('#b6');
		var b7 = $('#b7');
		var a1 = $('#a1');
		var a2 = $('#a2');
		var p1 = new waterFloat(b1,900,3,8);
		var p2 = new waterFloat(b2,700,3,8);
		var p3 = new waterFloat(b3,800,3,10);
		var p4 = new waterFloat(b4,900,3,8);
		var p5 = new waterFloat(b5,700,3,8);
		var p6 = new waterFloat(b6,800,3,10);
		var p7 = new waterFloat(b7,700,3,8);
		var p8 = new waterFloat(a1,700,3,8);
		var p9 = new waterFloat(a2,800,3,10);
	   });
</script>
	<script type="text/javascript">
		/* ==== start script ==== */
		
		
		setTimeout(function() {
			m3D.init([
			{ src: 'sc.jpg',title : '<b style="color:red">上传</b>',url:'<%=basePath%>upload.jsp' },
			{ src: 'xz.png',title : '<b style="color:red">下载</b>',url:'<%=basePath%>queryLists?rownum=10' },
			{ src: '0e85d4fe6d.jpg',title : '' },
			{ src: '1ef7ea6559.jpg',title : '' },
			{ src: '200ff06c0e.jpg',title : '' },
			{ src: '46eae50db6.jpg',title : '' },
			{ src: '5b0b0c8119.jpg',title : '' },
			{ src: '65f8787807.jpg',title : '' },
			{ src: '661a66329a.jpg',title : '' },
			{ src: '69833ed09a.jpg',title : '' },
			{ src: '6a884d6ef2.jpg',title : '' },
			{ src: '6a884d6ef2.jpg',title : '' },
			{ src: '73d310387e.jpg',title : '' },
			{ src: '774573728f.jpg',title : '' },
			{ src: '7b4cc906b3.jpg',title : '' },
			{ src: '8fe86226ff.jpg',title : '' },
			{ src: '94da4fb185.jpg',title : '' },
			{ src: 'a8008ae7f7.jpg',title : '' },
			{ src: 'b05b0c6962.jpg',title : '' },
			{ src: 'b05c9edc7f.jpg',title : '' },
			{ src: 'c136720da3.jpg',title : '' },
			{ src: 'd04505fe96.jpg',title : '' },
			{ src: 'd57dc05c81.jpg',title : '' },
			{ src: 'ed37a0925e.jpg',title : '' },
			{ src: 'ed57bce8c4.jpg',title : '' },
			{ src: 'f22e53da3a.jpg',title : '' },
			{ src: 'fe00425d0a.jpg',title : '' },
			{ src: 'yzbj1.jpg',title : '' }
			]);
		}, 300);
	</script>
</body>
</html>
