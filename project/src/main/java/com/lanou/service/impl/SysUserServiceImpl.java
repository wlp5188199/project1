package com.lanou.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.datatables.DataTables;
import com.lanou.entity.SysUser;
import com.lanou.mapper.SysUserMapper;
import com.lanou.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public DataTables selectPageUser(DataTables d) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("startTime", d.getTimeMin());
		map.put("endTime", d.getTimeMax());
		map.put("username", d.getSearch());

		d.setData(sysUserMapper.selectPageByUser(map));
		d.setRecordsFiltered(sysUserMapper.selectPageCount(map));
		d.setRecordsTotal(d.getRecordsFiltered());
		return d;
	}

	@Override
	public int insert(SysUser record) {
		return sysUserMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return sysUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SysUser record) {
		return sysUserMapper.updateByPrimaryKey(record);
	}

	@Override
	public SysUser selectByPrimaryKey(Integer id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

}
