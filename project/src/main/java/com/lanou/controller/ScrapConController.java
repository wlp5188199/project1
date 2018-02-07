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

import com.alibaba.fastjson.JSONObject;
import com.lanou.datatables.DataTables;
import com.lanou.entity.ScrapCollector;
import com.lanou.service.ScrapCollectorService;

/**
 * 废品管理员控制层
 * 
 * @author 王劉鹏
 *
 */
@RestController
@RequestMapping("/scrap_collector")
public class ScrapConController {

	/**
	 * 将废品回收员Service注入进来
	 */
	@Autowired
	private ScrapCollectorService scrapCollectorService;

	/**
	 * 获取所有废品回收员信息
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object getPageList(HttpServletRequest request) {
		return scrapCollectorService.selectAll(DataTables.getInstance(request, null));
	}

	/**
	 * 新增废品回收员信息
	 * 
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Object insert(ScrapCollector s) {
		Map<String, Object> map = new HashMap<>();
		int row = scrapCollectorService.insert(s);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}

	// http://localhost:8080/project/scrap_collector/del/
	// http://localhost:8080/project/scrap-collector/del/
	/**
	 * 删除废品回收员信息
	 * 
	 * @param idList
	 */
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public void delete(@RequestParam("idlist[]") List<Integer> idList) {
		for (Integer id : idList) {
			scrapCollectorService.deleteByPrimaryKey(id);
		}
	}

	/**
	 * 根据id获取废品回收员信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getScrapCollectorById", method = RequestMethod.POST)
	public Object selectScrapById(@RequestParam("id") int id) {
		return scrapCollectorService.selectByPrimaryKey(id);
	}

	/**
	 * 修改废品回收员信息
	 * 
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Object update(ScrapCollector s) {
		Map<String, Object> map = new HashMap<>();
		int row = scrapCollectorService.updateByPrimaryKeySelective(s);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}

}
