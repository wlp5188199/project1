package com.lanou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.entity.Area;
import com.lanou.mapper.AreaMapper;
import com.lanou.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaMapper areaMapper;

	@Override
	public List<Area> selectAll() {
		return areaMapper.selectAllArea();
	}

}
