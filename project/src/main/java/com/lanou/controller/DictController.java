package com.lanou.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.bean.DataTables;
import com.lanou.entity.SysDict;
import com.lanou.service.DictService;

@RestController
@RequestMapping("/dict")
public class DictController {
	@Autowired
	private DictService dictService;

	/**
	 * 分页显示列表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object selectAll(HttpServletRequest request) {

		return dictService.selectPageList(DataTables.getInstance(request, null));
	}

	/**
	 * 删除
	 * 
	 * @param idList
	 */
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public void delete(@RequestParam("idlist[]") List<Integer> idList) {
		for (Integer id : idList) {
			dictService.delete(id);
		}
	}

	/**
	 * 添加
	 * 
	 * @param d
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Object add(SysDict d) {
		Map<String, Object> map = new HashMap<>();
		int row = dictService.insert(d);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}

	/**
	 * 修改
	 * 
	 * @param d
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Object update(SysDict d) {
		Map<String, Object> map = new HashMap<>();
		int row = dictService.update(d);
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
	@RequestMapping(value = "/getDictById", method = RequestMethod.POST)
	public Object selectDictById(@RequestParam("id") Integer id) {
		SysDict d = dictService.selectDictById(id);
		return d;
	}

	/**
	 * 根据字典名称查询所有字典信息
	 * 
	 * @param dict_tabname
	 * @return
	 */
	@RequestMapping(value = "/selectAll", method = RequestMethod.POST)
	public Object selectAll(@RequestParam("dict_tabname") String dict_tabname) {
		List<SysDict> list = dictService.selectAll(dict_tabname);
		return list;
	}
}
