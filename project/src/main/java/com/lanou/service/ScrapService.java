package com.lanou.service;

import java.util.List;

import com.lanou.datatables.DataTables;
import com.lanou.entity.Scrap;

public interface ScrapService {

	/**
	 * 查询所有信息
	 * 
	 * @return
	 */
	DataTables selectAllScrap(DataTables d);

	/**
	 * 根据废品id删你出废品信息
	 * 
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 插入废品信息
	 * 
	 * @param record
	 * @return
	 */
	int insert(Scrap record);

	/**
	 * 修改废品信息
	 * 
	 * @param s
	 * @return
	 */
	int updateByPrimaryKeySelective(Scrap s);

	/**
	 * 根据id查询废品信息
	 * 
	 * @param id
	 * @return
	 */
	Scrap selectByPrimaryKey(Integer id);

}
