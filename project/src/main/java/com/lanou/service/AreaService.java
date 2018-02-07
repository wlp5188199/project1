package com.lanou.service;

import java.util.List;

import com.lanou.entity.Area;

public interface AreaService {

	/**
	 * 查询所有区域信息
	 * 
	 * @return
	 */
	List<Area> selectAll();
}
