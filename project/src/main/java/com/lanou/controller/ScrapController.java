package com.lanou.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.datatables.DataTables;
import com.lanou.entity.Scrap;
import com.lanou.service.ScrapService;

@RestController
@RequestMapping("/scrap")
public class ScrapController {

	/**
	 * 将service注入进来
	 */
	@Autowired
	private ScrapService scrapService;

	@ResponseBody
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object getPageList(HttpServletRequest request) {
		return scrapService.selectAllScrap(DataTables.getInstance(request, null));
	}

	/**
	 * 绑定参数idlist的list是小写的l
	 * 
	 * @param idList
	 */
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public void del(@RequestParam("idlist[]") List<Integer> idList) {
		for (Integer id : idList) {
			System.out.println(id);
			scrapService.deleteByPrimaryKey(id);
		}
	}

	/**
	 * 新增废品信息
	 * 
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Object insert(Scrap s) {
		Map<String, Object> map = new HashMap<>();
		int row = scrapService.insert(s);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;

	}

	/**
	 * 根据id查询废品信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getScrapById", method = RequestMethod.POST)
	public Object selectScrapById(@RequestParam("id") Integer id) {
		Scrap s = scrapService.selectByPrimaryKey(id);
		return s;
	}

	/**
	 * 修改
	 * 
	 * @param s
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Object update(Scrap s) {
		Map<String, Object> map = new HashMap<>();
		int row = scrapService.updateByPrimaryKeySelective(s);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}

}
