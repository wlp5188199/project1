package com.lanou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysDict;

public interface DictService {

	/**
	 * 查询数字字典分页
	 * @param d
	 * @return
	 */
	public DataTables selectPageList(DataTables d);
	/**
	 * 删除
	 */
	public int delete(int id);
	/**
	 * 添加
	 * @param d
	 * @return
	 */
	public int insert(SysDict d);
	/**
	 * 修改
	 * @param d
	 * @return
	 */
	public int update(SysDict d);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public SysDict selectDictById(int id);
	/**
	 * 查询所有信息
	 * 
	 * @return
	 */
	List<SysDict> selectAll(@Param("dict_tabname") String dict_tabname);
}
