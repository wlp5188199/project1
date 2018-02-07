package com.lanou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.entity.SysRole;
import com.lanou.mapper.SysRoleMapper;
import com.lanou.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Override
	public List<SysRole> selectAll() {
		return sysRoleMapper.select();
	}

}
