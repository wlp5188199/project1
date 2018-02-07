package com.lanou.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysRole;
import com.lanou.entity.SysUser;
import com.lanou.mapper.SysRoleMapper;
import com.lanou.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Resource
	private SysRoleMapper sysRoleMapper;

	@Override
	public DataTables selectAll(DataTables d) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("name", d.getSearch());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		System.out.println(map.toString());
		d.setData(sysRoleMapper.selectAll(map));
		d.setRecordsFiltered(sysRoleMapper.selectPageCount(map));
		// 获取过getRecordsFiltered 这两个值相等 直接拿d.获取就行
		d.setRecordsTotal(d.getRecordsFiltered());
		return d;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return sysRoleMapper.delete(id);
	}

	@Override
	public int insert(SysRole record, HttpServletRequest request) {
		// TODO Auto-generated method stub
		SysUser attribute = (SysUser) request.getSession().getAttribute("user");
		// 添加状态的默认值，从而能够在增加的时候显示出状态
		record.setStatus(1);
		// 获取登录存在session中的用户 为 添加方法里的创建人
		record.setCreate_id(attribute.getId());
		// 修改对象record的创建时间
		return sysRoleMapper.insert(record);
	}

	@Override
	public int update(SysRole record) {
		// TODO Auto-generated method stub
		return sysRoleMapper.update(record);
	}

	@Override
	public SysRole selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sysRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysRole> select() {
		// TODO Auto-generated method stub
		return sysRoleMapper.select();
	}
}
