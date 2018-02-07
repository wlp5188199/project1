package com.lanou.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lanou.entity.SysUser;

@WebFilter("/admin/index.jsp")
public class SysFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		// System.out.println("TestFilter init()===========");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("SysFilter doFilter()===========");
		HttpServletRequest rq = (HttpServletRequest)request;
		HttpServletResponse rp = (HttpServletResponse)response;
		SysUser userSession = (SysUser)rq.getSession().getAttribute("user");
		if(null == userSession){
			rp.sendRedirect("/project/admin/login.jsp");
		}else{
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		// System.out.println("TestFilter destroy()===========");
	}

}
