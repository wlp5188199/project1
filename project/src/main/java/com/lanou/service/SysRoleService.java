package com.lanou.service;

import java.util.List;

import com.lanou.entity.SysRole;

public interface SysRoleService {

	/**
	 * 查询所有角色
	 * 
	 * @return
	 */
	List<SysRole> selectAll();
}
