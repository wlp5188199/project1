package com.lanou.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.datatables.DataTables;
import com.lanou.entity.SysUser;
import com.lanou.mapper.SysUserMapper;
import com.lanou.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser selectUserByNameAndPwd(String username, String password) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", username);
		map.put("password", password);
		SysUser s = sysUserMapper.selectUserByNameAndPwd(map);
		return s;
	}

}
