package com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.druid.pool.GetConnectionTimeoutException;
import com.lanou.controller.ScrapController;
import com.lanou.datatables.DataTables;
import com.lanou.entity.ScrapCollector;
import com.lanou.mapper.ScrapCollectorMapper;
import com.lanou.service.ScrapCollectorService;

@Service
public class ScrapCollectorServiceImpl implements ScrapCollectorService {

	@Autowired
	private ScrapCollectorMapper scrapCollectorMapper;

	/**
	 * 查询所有废品管理员信息
	 */
	@Override
	public DataTables selectAll(DataTables d) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("name", d.getSearch());

		d.setData(scrapCollectorMapper.selectAll(map));
		d.setRecordsFiltered(scrapCollectorMapper.selectPageCount(map));
		d.setRecordsTotal(d.getRecordsFiltered());
		return d;
	}

	/**
	 * 插入废品管理员信息
	 */
	@Override
	public int insert(ScrapCollector s) {
		return scrapCollectorMapper.insert(s);
	}

	/**
	 * 根据id删除废品回收员名称
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {

		return scrapCollectorMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据id查询废品回收员信息
	 */
	@Override
	public ScrapCollector selectByPrimaryKey(Integer id) {
		return scrapCollectorMapper.selectByPrimaryKey(id);
	}

	/**
	 * 修改废品回收员信息
	 */
	@Override
	public int updateByPrimaryKeySelective(ScrapCollector record) {
		return scrapCollectorMapper.updateByPrimaryKey(record);
	}

}
