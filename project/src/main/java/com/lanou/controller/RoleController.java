package com.lanou.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysRole;
import com.lanou.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Resource
	private RoleService roleService;

	/**
	 * 分页显示角色管理信息
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object selectAll(HttpServletRequest request, HttpServletResponse response) {
		return roleService.selectAll(DataTables.getInstance(request, null));

	}

	/**
	 * 新增废品订单
	 * 
	 * @param record
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Object insert(SysRole record, HttpServletRequest request) {
		int row = roleService.insert(record, request);
		Map<String, Object> map = new HashMap<>();
		if (row > 0) {
			map.put("status", "200");
		}
		return map;

	}

	/**
	 * 删除废品订单
	 * 
	 * @param idlist
	 */
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public void delete(@RequestParam("idlist[]") List<Integer> idlist) {
		for (Integer integer : idlist) {
			roleService.delete(integer);
		}
	}

	/**
	 * 修改废品订单
	 * 
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Object update(SysRole record) {
		System.out.println(record.toString());
		int row = roleService.update(record);
		Map<String, Object> map = new HashMap<>();
		if (row > 0) {
			map.put("status", "200");
		}
		return map;

	}

	/**
	 * 根据id获取废品订单信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getRoleById", method = RequestMethod.POST)
	public Object getRoleById(Integer id) {
		return roleService.selectByPrimaryKey(id);
	}

	/**
	 * 查询所有角色信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/select", method = RequestMethod.POST)
	public Object select() {
		return roleService.select();
	}
}
