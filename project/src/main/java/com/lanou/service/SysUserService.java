package com.lanou.service;

import com.lanou.datatables.DataTables;
import com.lanou.entity.SysUser;

public interface SysUserService {
	/**
	 * 负责分页查询用户信息
	 * 
	 * @param d
	 * @return
	 */
	DataTables selectPageUser(DataTables d);

	/**
	 * 添加用户信息
	 * 
	 * @param record
	 * @return
	 */
	int insert(SysUser record);

	/**
	 * 根据id删除用户信息
	 * 
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 修改用户信息
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(SysUser record);

	/**
	 * 根据id查询用户信息
	 * 
	 * @param id
	 * @return
	 */
	SysUser selectByPrimaryKey(Integer id);

}
