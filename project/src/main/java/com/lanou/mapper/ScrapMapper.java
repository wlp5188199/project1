package com.lanou.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.entity.Scrap;

@MapperScan
public interface ScrapMapper {
	/**
	 * 根据废品id删除废品信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 新增废品信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int insert(Scrap record);

	/**
	 * 动态新增废品信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int insertSelective(Scrap record);

	/**
	 * 根据废品id查询废品信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	Scrap selectByPrimaryKey(Integer id);

	/**
	 * 动态修改废品信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int updateByPrimaryKeySelective(Scrap record);

	/**
	 * 修改废品信息 This method was generated by MyBatis Generator. This method
	 * corresponds to the database table scrap
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	int updateByPrimaryKey(Scrap record);

	/**
	 * 查询所有废品信息
	 * 
	 * @return
	 */
	List<Scrap> selectAllScrap(Map<String, Object> map);

	/**
	 * 查询废品的总记录数
	 * 
	 * @param map
	 * @return
	 */
	int selectPageScrapCount(Map<String, Object> map);

}