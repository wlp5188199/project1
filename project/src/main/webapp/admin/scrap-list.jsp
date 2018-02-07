﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/lib/Hui-iconfont/1.0.7/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/lib/icheck/skins/minimal/minimal.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/static/h-ui.admin/css/style.css" />
		<title>管理员列表</title>
	</head>

	<body>
		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 管理员列表
			<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a>
		</nav>
		<div class="page-container">
			<div class="cl pd-5 bg-1 bk-gray mt-20">
				<div class="l">
					<a href="javascript:;" onclick="del(getDTSelect(), '/scrap/del/', reloadTable)" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
					<a href="javascript:;" onclick="add('添加废品','scrap-add.jsp')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加废品</a>
				</div>
				<div class="r">
					<input type="text" id="search" placeholder="废品名称" style="width:250px" class="input-text">
					<button id="doSearch" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
				</div>

			</div>
			<table class="table table-border table-bordered table-hover table-bg table-sort" width="100%">
				<thead>
					<tr class="text-c">
						<th><input id="input-0" type="checkbox" name="all"><label for="input-0"></label></th>
						<th>废品编码</th>
						<th>废品名称</th>
						<th>类别</th>
						<th>单位</th>
						<th>价格（分/千克）</th>
						<th>积分（每千克）</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/lib/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/lib/layer/2.1/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/lib/icheck/icheck.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/static/h-ui/js/H-ui.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/static/h-ui.admin/js/H-ui.admin.js"></script>
		<script type="text/javascript"> var contextPath = "${pageContext.request.contextPath}";</script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/lib/datatables/datatables.optimize.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pages/commandScript.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/pages/scrap_list.js"></script>
	</body>

</html>