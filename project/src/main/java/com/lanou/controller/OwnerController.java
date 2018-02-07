package com.lanou.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.bean.DataTables;
import com.lanou.service.OwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {
	/**
	 * 将业主Service注入进来
	 */
	@Autowired
	private OwnerService ownerService;

	/**
	 * 获取所有业主信息
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object ownerList(HttpServletRequest request) {
		return ownerService.selectAll(DataTables.getInstance(request, null));
	}
}
