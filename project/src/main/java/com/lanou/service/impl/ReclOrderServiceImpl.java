package com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.ReclBean;
import com.lanou.datatables.DataTables;
import com.lanou.entity.ReclOrder;
import com.lanou.mapper.ReclOrderMapper;
import com.lanou.service.ReclOrderService;

@Service
public class ReclOrderServiceImpl implements ReclOrderService {

	@Autowired
	private ReclOrderMapper reclOrderMapper;

	/**
	 * 查询所有废品订单管理信息
	 */

	@Override
	public DataTables selectPageReclOrder(DataTables d) {
		Map<String, Object> map = new HashMap<>();
		map.put("owner_name", d.getSearch());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("length", d.getLength());
		map.put("start", d.getStart());

		d.setData(reclOrderMapper.selectAll(map));
		d.setRecordsFiltered(reclOrderMapper.selectPageCount(map));
		d.setRecordsTotal(d.getRecordsFiltered());
		return d;
	}

}
