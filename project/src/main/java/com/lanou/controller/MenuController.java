package com.lanou.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysMenu;
import com.lanou.entity.SysUser;
import com.lanou.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	/**
	 * 将菜单Service注入进来
	 */
	@Autowired
	private MenuService menuService;

	/**
	 * 获取所有菜单信息
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object show(HttpServletRequest request) {

		return menuService.selectByparentName(DataTables.getInstance(request, null));
	}

	/**
	 * 新增菜单信息
	 * 
	 * @param s
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Object insert(SysMenu s, HttpServletRequest request) {
		SysUser u = (SysUser) request.getSession().getAttribute("user");
		s.setCreate_time(new Date());
		s.setUpdate_time(new Date());
		s.setUpdate_id(u.getId());
		s.setCreate_id(u.getId());
		int row = menuService.insert(s);

		Map<String, Object> map = new HashMap<>();
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;

	}

	/**
	 * 删除菜单信息
	 * 
	 * @param idlist
	 * @param request
	 * @param response
	 */
	@RequestMapping("/del")
	public void delete(@RequestParam("idlist[]") List<Integer> idlist, HttpServletRequest request,
			HttpServletResponse response) {
		if (idlist != null) {
			for (Integer id : idlist) {
				menuService.delete(id);
			}

		}
	}

	/**
	 * 修改
	 * 
	 * @param d
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Object update(SysMenu d, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		SysUser u = (SysUser) request.getSession().getAttribute("user");
		d.setUpdate_time(new Date());
		d.setUpdate_id(u.getId());
		int row = menuService.update(d);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getMenuById", method = RequestMethod.POST)
	public Object selectDictById(@RequestParam("id") Integer id) {
		SysMenu d = menuService.selectMenuById(id);
		return d;
	}

	/**
	 * 查询所有菜单信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/selectAll", method = RequestMethod.POST)
	public Object selectAll() {
		return menuService.selectAll();
	}

}
