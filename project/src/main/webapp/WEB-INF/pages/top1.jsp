<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	

  </head>
  <body class=""> 
        <div class="navbar-inner">
                <ul class="nav pull-right">
                    
                    <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i> ${user.userName}
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="${pageContext.request.contextPath }/user/logout.do">登出</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <a class="brand" href="${pageContext.request.contextPath }/user/index.do"><span class="first">业主服务</span> <span class="second">后台管理系统</span></a>
        </div>
  </body>
</html>


