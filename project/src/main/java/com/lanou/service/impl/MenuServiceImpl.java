package com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysMenu;
import com.lanou.mapper.SysMenuMapper;
import com.lanou.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private SysMenuMapper sysMenuMapper;

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sysMenuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysMenu s) {
		// TODO Auto-generated method stub
		return sysMenuMapper.insertSelective(s);
	}

	@Override
	public DataTables selectByparentName(DataTables d) {

		Map<String, Object> map = new HashMap<>();
		map.put("name", d.getSearch());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		d.setData(sysMenuMapper.selectAll(map));
		d.setRecordsFiltered(sysMenuMapper.selectCount(map));
		return d;

	}

	@Override
	public int update(SysMenu m) {
		return sysMenuMapper.updateByPrimaryKeySelective(m);
	}

	@Override
	public SysMenu selectMenuById(int id) {
		return sysMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysMenu> selectAll() {
		// TODO Auto-generated method stub
		return sysMenuMapper.selectMenuAll();
	}

}
