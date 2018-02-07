<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title></title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/bootstrap/css/bootstrap.css">
    
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/lib/font-awesome/css/font-awesome.css">

    <script src="${pageContext.request.contextPath }/lib/jquery-1.7.2.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/lib/bootstrap/js/bootstrap.js"></script>
	<script src="${pageContext.request.contextPath }/common/js/route.js"></script>
	<script src="${pageContext.request.contextPath }/common/js/commonFilling.js"></script>
    <script type="text/javascript">
    	var ctx = "${pageContext.request.contextPath }";
    	

        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
            
        });
    </script>

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

  </head>
  <body class=""> 
  	<!-- 顶部块区 -->
    <div id="top" class="navbar">
   	 	<jsp:include page="top.jsp"></jsp:include>
    </div>
    <!-- 左侧菜单块区 -->
    <div id="leftMenu" class="sidebar-nav">
   	 	<jsp:include page="leftMenu.jsp"></jsp:include>
    </div>
    <!-- 右侧正文块区 -->
    <div id="content" class="content">
        <jsp:include page="content.jsp"></jsp:include>
    </div>
  </body>
</html>


