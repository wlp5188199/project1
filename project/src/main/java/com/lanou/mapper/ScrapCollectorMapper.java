package com.lanou.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.bean.ScrapCollectorBean;
import com.lanou.entity.ScrapCollector;

@MapperScan
public interface ScrapCollectorMapper {
	/**
	 * 根据废品回收员id删除废品回收员信息 This method was generated by MyBatis Generator. This
	 * method corresponds to the database table scrap_collector
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 新增废品回收员信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap_collector
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int insert(ScrapCollector record);

	/**
	 * 动态新增废品回收员信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap_collector
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int insertSelective(ScrapCollector record);

	/**
	 * 根据废品回收员id查询废品回收员信息 This method was generated by MyBatis Generator. This
	 * method corresponds to the database table scrap_collector
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	ScrapCollector selectByPrimaryKey(Integer id);

	/**
	 * 动态修改废品回收员信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap_collector
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int updateByPrimaryKeySelective(ScrapCollector record);

	/**
	 * 修改废品回收员信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap_collector
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int updateByPrimaryKey(ScrapCollector record);

	/**
	 * 查询所有废品管理员
	 * 
	 * @return
	 */
	List<ScrapCollectorBean> selectAll(Map<String, Object> map);

	/**
	 * 查询总的页数
	 * 
	 * @param map
	 * @return
	 */
	int selectPageCount(Map<String, Object> map);

}