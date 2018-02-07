package com.lanou.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lanou.datatables.DataTables;
import com.lanou.service.ReclOrderService;

@RestController
@RequestMapping("/reclamation_order")
public class ReclOrderController {

	/**
	 * 将订单Service注入进来
	 */
	@Autowired
	private ReclOrderService reclOrderService;

	/**
	 * 获取所有废品订单信息
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getPageList", method = RequestMethod.POST)
	public Object getPageList(HttpServletRequest request) {
		return reclOrderService.selectPageReclOrder(DataTables.getInstance(request, null));
	}
}
