package com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.datatables.DataTables;
import com.lanou.entity.Scrap;
import com.lanou.mapper.ScrapMapper;
import com.lanou.service.ScrapService;

@Service
public class ScrapServiceImpl implements ScrapService {

	/**
	 * 将mapper接口注入进来
	 */
	@Autowired
	private ScrapMapper scrapMapper;

	/**
	 * 查询所有废品信息
	 */
	@Override
	public DataTables selectAllScrap(DataTables d) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", d.getStart());
		map.put("length", d.getLength());
		map.put("column", d.getColumn());
		map.put("order", d.getOrder());
		map.put("scrap_name", d.getSearch());

		d.setData(scrapMapper.selectAllScrap(map));
		d.setRecordsFiltered(scrapMapper.selectPageScrapCount(map));
		d.setRecordsTotal(d.getRecordsFiltered());
		return d;
	}

	/**
	 * 根据废品id删除废品信息
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return scrapMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 添加废品信息
	 */
	@Override
	public int insert(Scrap record) {
		return scrapMapper.insert(record);
	}

	/**
	 * 修改废品信息
	 */
	@Override
	public int updateByPrimaryKeySelective(Scrap s) {
		return scrapMapper.updateByPrimaryKeySelective(s);
	}

	/**
	 * 根据id查询废品信息
	 */
	@Override
	public Scrap selectByPrimaryKey(Integer id) {
		return scrapMapper.selectByPrimaryKey(id);
	}

}
