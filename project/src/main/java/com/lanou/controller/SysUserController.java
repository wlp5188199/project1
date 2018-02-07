package com.lanou.controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.datatables.DataTables;
import com.lanou.entity.SysUser;
import com.lanou.service.SysUserService;

@RestController
@RequestMapping("/admin")
public class SysUserController {
	String oldpasswd;
	/**
	 * 将用户Service注入进来
	 */
	@Autowired
	private SysUserService sysUserService;

	/**
	 * 获取所有用户信息
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object getPageList(HttpServletRequest request) {
		return sysUserService.selectPageUser(DataTables.getInstance(request, null));
	}

	/**
	 * 新增用户信息，以及MD5加密
	 * 
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Object insert(SysUser s) {
		String pwd = s.getPassword();
		// 确定计算方法
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 加密后的字符串
		try {
			byte[] encodeBase64 = Base64.encodeBase64(pwd.getBytes("UTF-8"));
			s.setPassword(encodeBase64.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 利用MD5进行加密
		 * 
		 * @param str
		 *            待加密的字符串
		 * @return 加密后的字符串
		 * @throws NoSuchAlgorithmException
		 *             没有这种产生消息摘要的算法
		 * @throws UnsupportedEncodingException
		 */
		String str = s.getPassword();
		s.setPassword(toMd5(str).toString());
		Map<String, Object> map = new HashMap<>();
		s.setCreate_time(new Date());
		int row = sysUserService.insert(s);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}

	/**
	 * 删除用户信息
	 * 
	 * @param idlist
	 */
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public void delete(@RequestParam("idlist[]") List<Integer> idlist) {
		for (Integer id : idlist) {
			sysUserService.deleteByPrimaryKey(id);
		}
	}

	/**
	 * 根据用户id查询用户信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getAdminById", method = RequestMethod.POST)
	public Object SelectUserById(@RequestParam("id") int id) {
		SysUser u = sysUserService.selectByPrimaryKey(id);
		oldpasswd = u.getPassword();
		u.setPassword(null);
		return u;
	}

	/**
	 * 修改用户信息
	 * 
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Object update(SysUser s) {
		Map<String, Object> map = new HashMap<>();
		s.setUpdate_time(new Date());
		int row = sysUserService.updateByPrimaryKeySelective(s);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}

	private Object toMd5(String pwd) {
		String newPwd = "";
		// 确定计算方法
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 加密后的字符串
		try {
			byte[] encodeBase64 = Base64.encodeBase64(pwd.getBytes("UTF-8"));
			newPwd = encodeBase64.toString();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newPwd;
	}
}
