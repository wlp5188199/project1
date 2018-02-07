package com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysDict;
import com.lanou.mapper.SysDictMapper;
import com.lanou.service.DictService;
@Service
public class DictServiceImpl implements DictService {
	@Autowired
	private SysDictMapper sysDictMapper;
	
	@Override
	public DataTables selectPageList(DataTables d) {
		Map<String, Object>map=new HashMap<>();
		map.put("name", d.getSearch());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		d.setData(sysDictMapper.selectPageList(map));
		d.setRecordsFiltered(sysDictMapper.selectCount(map));
		return d;
	}

	@Override
	public int delete(int id) {
		
		return sysDictMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysDict d) {
		
		return sysDictMapper.insert(d);
	}

	@Override
	public int update(SysDict d) {
		return sysDictMapper.updateByPrimaryKeySelective(d);
	}

	@Override
	public SysDict selectDictById(int id) {
		return sysDictMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysDict> selectAll(@Param("dict_tabname") String dict_tabname) {
		return sysDictMapper.selectAll(dict_tabname);
	}
	
}
