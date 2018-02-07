package com.lanou.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysRole;

public interface RoleService {
	/**
	 * 分页查询角色管理 展示数据
	 * 
	 * @param d
	 * @return
	 */
	public DataTables selectAll(DataTables d);

	/**
	 * 删除角色
	 * 
	 * @param id
	 * @return
	 */
	int delete(Integer id);

	/**
	 * 添加角色
	 * 
	 * @param record
	 * @param request
	 * @return
	 */
	int insert(SysRole record, HttpServletRequest request);

	/**
	 * 修改角色
	 * 
	 * @param record
	 * @return
	 */
	int update(SysRole record);

	/**
	 * 根据id获取值
	 * 
	 * @param id
	 * @return
	 */
	SysRole selectByPrimaryKey(Integer id);

	/**
	 * 查询所有角色
	 * 
	 * @return
	 */
	List<SysRole> select();

}
