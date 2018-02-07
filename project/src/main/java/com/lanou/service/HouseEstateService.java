package com.lanou.service;

import java.util.List;

import com.lanou.bean.DataTables;
import com.lanou.entity.HouseEstate;

public interface HouseEstateService {

	/**
	 * 分页查询小区信息
	 * 
	 * @param d
	 * @return
	 */
	public DataTables selectAll(DataTables d);

	/**
	 * 查询所有小区信息
	 * 
	 * @return
	 */
	List<HouseEstate> selectAllHouse(Integer cityCode);
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	int delete(int id);
	/**
	 * 添加
	 * @param h
	 * @return
	 */
	int insert(HouseEstate h);
	/**
	 * 修改
	 * @param h
	 * @return
	 */
	int update(HouseEstate h);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	HouseEstate selectHouseById(int id);
	
}
