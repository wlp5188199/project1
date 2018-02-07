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
import com.lanou.entity.HouseEstate;
import com.lanou.entity.SysDict;
import com.lanou.service.HouseEstateService;

@RestController
@RequestMapping("/housing_estate")
public class HouseEstateController {
	@Autowired
	private HouseEstateService houseEstateService;
	/**
	 * 一页显示的内容
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object houseList(HttpServletRequest request) {

		return houseEstateService.selectAll(DataTables.getInstance(request, null));
	}
	/**
	 * 省市联动
	 * @param cityCode
	 * @return
	 */
	@RequestMapping(value = "/getHousingEstateByCityCode", method = RequestMethod.POST)
	public Object getList(@RequestParam("cityCode") Integer cityCode) {
		return houseEstateService.selectAllHouse(cityCode);
	}
	/**
	 * 删除
	 * @param idList
	 * @return
	 */
	@RequestMapping(value="/del",method=RequestMethod.POST)
	public Object delete(@RequestParam("idlist[]")List<Integer>idList) {
		for (Integer id : idList) {
			houseEstateService.delete(id);
		}
		return null;
	}
	/**
	 * 添加
	 * @param d
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Object add(HouseEstate h) {
		Map<String, Object> map = new HashMap<>();
		int row =houseEstateService.insert(h);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}
	/**
	 * 修改
	 * @param d
	 * @return
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Object update(HouseEstate h) {
		Map<String, Object> map = new HashMap<>();
		int row = houseEstateService.update(h);
		if (row > 0) {
			map.put("status", "200");
			return map;
		}
		return null;
	}
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/getHousingEstateById",method=RequestMethod.POST)
	public Object selectDictById(@RequestParam("id")Integer id) {
		HouseEstate h=houseEstateService.selectHouseById(id);
		return h;
	}
	
	
	
}