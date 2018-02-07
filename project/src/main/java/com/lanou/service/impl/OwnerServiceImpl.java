package com.lanou.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.DataTables;
import com.lanou.mapper.OwnerMapper;
import com.lanou.service.OwnerService;
@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerMapper ownerMapper;
	@Override
	public DataTables selectAll(DataTables d) {
		Map<String, Object>map=new HashMap<>();
		map.put("username", d.getSearch());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		
		d.setData(ownerMapper.selectAll(map));
//		List<OwnerBean> owner = ownerMapper.selectAll(map);
		d.setRecordsFiltered(ownerMapper.selectCount(map));
		return d;
	}

}
