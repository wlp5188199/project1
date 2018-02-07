package com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.DataTables;
import com.lanou.entity.HouseEstate;
import com.lanou.mapper.HouseEstateMapper;
import com.lanou.service.HouseEstateService;
@Service
public class HouseEstateServiceImpl implements HouseEstateService {
	@Autowired
	private HouseEstateMapper houseEstateMapper;
	@Override
	public DataTables selectAll(DataTables d) {
		Map<String, Object>map=new HashMap<>();
		map.put("name", d.getSearch());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		d.setData(houseEstateMapper.selectAll(map));
		d.setRecordsFiltered(houseEstateMapper.selectCount(map));
		return d;
	}
	@Override
	public List<HouseEstate> selectAllHouse(Integer cityCode) {
		
		return houseEstateMapper.selectAllHouse(cityCode);
	}
	@Override
	public int delete(int id) {
		
		return houseEstateMapper.deleteByPrimaryKey(id);
	}
	@Override
	public int insert(HouseEstate h) {
		// TODO Auto-generated method stub
		return houseEstateMapper.insertSelective(h);
	}
	@Override
	public int update(HouseEstate h) {
		// TODO Auto-generated method stub
		return houseEstateMapper.updateByPrimaryKeySelective(h);
	}
	@Override
	public HouseEstate selectHouseById(int id) {
		// TODO Auto-generated method stub
		return houseEstateMapper.selectByPrimaryKey(id);
	}

}
