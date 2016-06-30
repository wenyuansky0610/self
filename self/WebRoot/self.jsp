<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>The meaning of itself</title>
<meta name="description" content="Decorative &amp; interactive isometric &amp; 3D grids." />
<meta name="keywords" content="isometric, grid, images, masonry, perspective" />
<meta name="author" content="jq22" />
<link rel="stylesheet" type="text/css" href="IsometricGrids/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="IsometricGrids/css/demo.css" />
<link rel="stylesheet" type="text/css" href="IsometricGrids/css/component.css" />
<script src="IsometricGrids/js/modernizr.custom.js"></script>
<link rel="stylesheet" type="text/css" href="header/css/style.css">
<script type="text/javascript" src="header/js/jquery-1.9.1.min.js"></script>
</head>
<body class="demo-2">
	<main>


	<div id="header" class="container">
		<div id="header_logo"></div>
		<div id="header_nav">
			<ul id="header_menu_list">
				<li class="header_menu_list header_menu_list_checked header_menu_list_fi"><a href="#">首页</a></li>
				<li class="header_menu_list"><span></span><a href="#">音乐</a></li>
				<li class="header_menu_list"><span></span><a href="#">图片</a></li>
				<li class="header_menu_list"><span></span><a href="#">小说</a></li>
				<li class="header_menu_list"><span></span><a href="#">影视</a></li>
				<li class="header_menu_list"><span></span><a href="#">小功能</a></li>
				<div class="clear"></div>
			</ul>
			<div id="header_menu_details">
				<div id="header_menu_details_box">
					<div id="header_menu_details_mask">
						<div class="header_detail_container">

							<div class="clear"></div>
						</div>
						<div class="header_detail_container">
							<div class="header_detail_box">
								<a href="http://music.163.com/#/playlist?id=40462805" target="_blank">
									<div class="header_detail_img1">
										<div class="header_detail_imgCover"></div>
									</div>
									<p class="header_detail_title">
										<img src="header/image/nav_menu_arrow.png" alt="">网易云音乐
									</p>
								</a>
							</div>
							<div class="header_detail_box">
								<a href="http://www.kugou.com/" target="_blank">
									<div class="header_detail_img2">
										<div class="header_detail_imgCover"></div>
									</div>
									<p class="header_detail_title">
										<img src="header/image/nav_menu_arrow.png" alt="">酷狗音乐
									</p>
								</a>
							</div>
							<div class="header_detail_box">
								<a href="http://music.baidu.com/" target="_blank">
									<div class="header_detail_img3">
										<div class="header_detail_imgCover"></div>
									</div>
									<p class="header_detail_title">
										<img src="header/image/nav_menu_arrow.png" alt="">百度音乐
									</p>
								</a>
							</div>
							<div class="header_detail_box">
								<a href="http://www.xiami.com/" target="_blank">
									<div class="header_detail_img4">
										<div class="header_detail_imgCover"></div>
									</div>
									<p class="header_detail_title">
										<img src="header/image/nav_menu_arrow.png" alt="">虾米音乐
									</p>
								</a>
							</div>
							<div class="clear"></div>
						</div>
						<div class="header_detail_container">
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="clear"></div>
						</div>
						<div class="header_detail_container">
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="clear"></div>
						</div>
						<div class="header_detail_container">
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="header_detail_box">
								<div class="header_detail_img">
									<div class="header_detail_imgCover"></div>
								</div>
								<p class="header_detail_title">
									<img src="header/image/nav_menu_arrow.png" alt="">示例文字
								</p>
							</div>
							<div class="clear"></div>
						</div>
						<div class="header_detail_container">
							<div class="header_detail_box">
								<a href="<%=basePath%>upload.jsp" target="_blank">
									<div class="header_detail_img">
										<div class="header_detail_imgCover"></div>
									</div>
									<p class="header_detail_title">
										<img src="header/image/nav_menu_arrow.png" alt="">上传文件
									</p>
								</a>
							</div>
							<div class="clear"></div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
			</div>
		</div>
		<div id="header_search">
			<input class="header_search_text" type="text" name="" id="header_search_text" value="输入搜索内容"> <input class="header_search_subm" type="submit" value="">
		</div>
		<div class="clear"></div>
	</div>

	<section class="section section--shots section--right">
	<h2 class="section__heading">
		The meaning <em>OF</em> itself
	</h2>
	<p class="section__subtitle">你就是你，世界上唯一的一个，不要因为羡慕或者别的情绪，而让自己成为他人的复制品，这没有意义，生命之所以珍贵，正是因为它的不可复制。</p>
	<div class="isolayer isolayer--deco4">
		<ul class="grid">
			<li class="grid__item"><a class="grid__link" href="#"><img class="grid__img layer" src="IsometricGrids/img/Dribbble/1.png" alt="01" /> </a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/2.png" alt="02" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/3.png" alt="03" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/4.png" alt="04" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/5.png" alt="05" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/6.png" alt="06" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/7.png" alt="07" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/8.png" alt="08" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/9.png" alt="09" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/10.png" alt="10" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/1.png" alt="01" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/2.png" alt="02" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/3.png" alt="03" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/4.png" alt="04" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/5.png" alt="05" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/6.png" alt="06" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/7.png" alt="07" /></a></li>
			<li class="grid__item"><a class="grid__link" href="#"><div class="layer"></div>
					<div class="layer"></div>
					<div class="layer"></div> <img class="grid__img layer" src="IsometricGrids/img/Dribbble/8.png" alt="08" /></a></li>
		</ul>
	</div>
	</section> </main>
	<script src="IsometricGrids/js/imagesloaded.pkgd.min.js"></script>
	<script src="IsometricGrids/js/masonry.pkgd.min.js"></script>
	<script src="IsometricGrids/js/dynamics.min.js"></script>
	<script src="IsometricGrids/js/classie.js"></script>
	<script src="IsometricGrids/js/main.js"></script>
	<script>
		(function() {
			function getRandomInt(min, max) {
				return Math.floor(Math.random() * (max - min + 1)) + min;
			}

			new IsoGrid(
					document.querySelector('.isolayer--deco4'),
					{
						perspective : 3000,
						transform : 'translate3d(-90px,-105px,0) scale3d(0.8,0.8,1) rotateY(45deg) rotateZ(-10deg)',
						stackItemsAnimation : {
							properties : function(pos) {
								return {
									rotateX : (pos + 1) * -15
								};
							},
							options : function(pos, itemstotal) {
								return {
									type : dynamics.spring,
									delay : (itemstotal - pos - 1) * 30
								};
							}
						},
						onGridLoaded : function() {
							classie.add(document.body, 'grid-loaded');
						}
					});
		})();
	</script>
	<script type="text/javascript" src="header/js/common.js"></script>
</body>
</html>
