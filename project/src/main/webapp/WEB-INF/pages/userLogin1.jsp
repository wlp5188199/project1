<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/theme.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/font-awesome/css/font-awesome.css">

    <script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery-1.8.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/lib/bootstrap/js/bootstrap.js"></script>
	<style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
    </style>
<script type="text/javascript">
$("[rel=tooltip]").tooltip();
$(function() {
    $('.demo-cancel-click').click(function(){return false;});
});
function loginForm(){
	if(!$("#username").val()){
		alert("请正确输入用户名！");
		return false;
	}
	if(!$("#password").val()){
		alert("请正确输入密码！");
		return false;
	}
	$("#loginForm").submit();
}
</script>
</head>  
<body>  
	
    <div class="navbar">
        <div class="navbar-inner">
            <ul class="nav pull-right">
                
            </ul>
            <a class="brand" href="${pageContext.request.contextPath }/user/index.do"><span class="first">业主服务</span> <span class="second">后台管理系统</span></a>
        </div>
    </div>
   	<div class="row-fluid">
	    <div class="dialog">
	        <div class="block">
	            <p class="block-heading">登录</p>
	            <div class="block-body">
	                <form action="${pageContext.request.contextPath }/user/login.do" id="loginForm" method="post">
	                    <label>用户名</label>
	                    <input type="text" class="span12" name="username" id="username">
	                    <label>密码</label>
	                    <input type="password" class="span12" name="password" id="password">
	                    <a href="javascript:void(0);" class="btn btn-primary pull-right" onclick="loginForm();">登录</a>
	                    <div class="clearfix"></div>
	                </form>
	            </div>
	        </div>
	    </div>
	</div>
</body>

</html>