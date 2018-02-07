package com.lanou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.service.AreaService;

@RestController
@RequestMapping("/housing_estate")
public class AreaController {

	/**
	 * 将地区service注入进来
	 */
	@Autowired
	private AreaService areaService;

	/**
	 * 获取所有地区信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getAreas", method = RequestMethod.POST)
	public Object getAreas() {
		return areaService.selectAll();
	}
}
