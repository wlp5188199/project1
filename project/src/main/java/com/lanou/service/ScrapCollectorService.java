package com.lanou.service;

import java.util.List;
import java.util.Map;

import com.lanou.bean.ScrapCollectorBean;
import com.lanou.datatables.DataTables;
import com.lanou.entity.ScrapCollector;

public interface ScrapCollectorService {

	/**
	 * 查询所有废品管理员
	 * 
	 * @return
	 */
	DataTables selectAll(DataTables d);

	/**
	 * 插入废品管理员信息
	 * 
	 * @param s
	 * @return
	 */
	int insert(ScrapCollector s);

	/**
	 * 根据id删除废品回收员名称
	 * 
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 根据id查询废品回收员信息
	 * 
	 * @param id
	 * @return
	 */
	ScrapCollector selectByPrimaryKey(Integer id);

	/**
	 * 更新废品回收员信息
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(ScrapCollector record);

}
