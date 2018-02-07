package com.lanou.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.entity.SysUser;
import com.lanou.service.UserService;
import com.lanou.util.VerifyCodeUtils;
import com.mysql.jdbc.V1toV2StatementInterceptorAdapter;

@RestController
@RequestMapping("/admin")
public class LoginController {
	@Autowired
	private UserService userService;

	/**
	 * 获取验证码
	 * 
	 * @param response
	 * @param session
	 */
	@RequestMapping("/getValidateCode")
	public void getValidateCode(HttpServletResponse response, HttpSession session) {
		response.setHeader("Prama", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
		// 获取验证码
		String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
		// 首先删除之前的验证码
		session.removeAttribute(verifyCode);
		// 再将验证码放到session里面去
		session.setAttribute("verifyCode", verifyCode);
		try {
			VerifyCodeUtils.outputImage(80, 40, response.getOutputStream(), verifyCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 登陆实现方法
	 * 
	 * @param session
	 * @param request
	 * @param response
	 * @param username
	 * @param password
	 * @param ValidateCode
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Object login(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("ValidateCode") String ValidateCode) {
		SysUser s = userService.selectUserByNameAndPwd(username, password);
		String verifyCode1 = (String) session.getAttribute("verifyCode");
		System.out.println(verifyCode1);
		System.out.println(ValidateCode);
		session.setAttribute("user", s);
		if (!ValidateCode.equals(verifyCode1)) {
			return "false_ValidateCode";
		} else {
			if (s == null) {
				return "false";
			} else {
				return "true";
			}
		}
	}

	/**
	 * 登出方法
	 * 
	 * @param session
	 * @param response
	 */
	@RequestMapping("/logout")
	public void logout(HttpSession session, HttpServletResponse response) {
		session.removeAttribute("user");
		try {
			response.sendRedirect("/project/admin/login.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
