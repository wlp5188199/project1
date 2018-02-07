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

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/style.css" />

	<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/1.9.1/jquery.min.js"></script> 
	<script type="text/javascript" src="${pageContext.request.contextPath }/lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui.admin/js/H-ui.admin.js"></script> 
	<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>

    <script type="text/javascript">
		$(function(){
			/*$("#min_title_list li").contextMenu('Huiadminmenu', {
				bindings: {
					'closethis': function(t) {
						console.log(t);
						if(t.find("i")){
							t.find("i").trigger("click");
						}		
					},
					'closeall': function(t) {
						alert('Trigger was '+t.id+'\nAction was Email');
					},
				}
			});*/
		});
		/*个人信息*/
		function myselfinfo(){
			layer.open({
				type: 1,
				area: ['300px','200px'],
				fix: false, //不固定
				maxmin: true,
				shade:0.4,
				title: '查看信息',
				content: '<div>管理员信息</div>'
			});
		}
		
		/*资讯-添加*/
		function article_add(title,url){
			var index = layer.open({
				type: 2,
				title: title,
				content: url
			});
			layer.full(index);
		}
		/*图片-添加*/
		function picture_add(title,url){
			var index = layer.open({
				type: 2,
				title: title,
				content: url
			});
			layer.full(index);
		}
		/*产品-添加*/
		function product_add(title,url){
			var index = layer.open({
				type: 2,
				title: title,
				content: url
			});
			layer.full(index);
		}
		/*用户-添加*/
		function member_add(title,url,w,h){
			layer_show(title,url,w,h);
		}
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
    <header class="navbar-wrapper">
   	 	<jsp:include page="top.jsp"></jsp:include>
    </header>
    <!-- 左侧菜单块区 -->
    <aside class="Hui-aside">
   	 	<jsp:include page="leftMenu.jsp"></jsp:include>
    </aside>
    <!-- 右侧正文块区 -->
    <div id="content">
        <jsp:include page="content.jsp"></jsp:include>
    </div>
  </body>
</html>


