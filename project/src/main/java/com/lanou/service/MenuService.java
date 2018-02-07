package com.lanou.service;

import java.util.List;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysMenu;

public interface MenuService {

	/**
	 * 根据ID删除用户信息
	 * 
	 * @param id
	 * @return
	 */
	public void delete(int id);

	/**
	 * 在菜单中添加数据
	 */
	public int insert(SysMenu s);

	/**
	 * 查询所有的数据分页
	 * 
	 * @return
	 */
	public DataTables selectByparentName(DataTables d);

	/**
	 * 修改
	 * 
	 * @param m
	 * @return
	 */
	public int update(SysMenu m);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public SysMenu selectMenuById(int id);

	/**
	 * 插叙所有角色信息
	 * 
	 * @return
	 */
	public List<SysMenu> selectAll();
}
