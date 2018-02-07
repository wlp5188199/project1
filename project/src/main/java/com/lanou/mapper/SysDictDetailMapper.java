package com.lanou.mapper;

import org.mybatis.spring.annotation.MapperScan;

import com.lanou.entity.SysDictDetail;
@MapperScan
public interface SysDictDetailMapper {
    /**根据字典详细信息id删除详细字典信息
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict_detail
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    int deleteByPrimaryKey(Integer detail_id);

    /**新增详细字典信息
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict_detail
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    int insert(SysDictDetail record);

    /**动态新增详细字典信息
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict_detail
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    int insertSelective(SysDictDetail record);

    /**根据详细字典id查询详细字典信息
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict_detail
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    SysDictDetail selectByPrimaryKey(Integer detail_id);

    /**动态修改详细字典信息
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict_detail
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    int updateByPrimaryKeySelective(SysDictDetail record);

    /**修改详细字典信息
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict_detail
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    int updateByPrimaryKey(SysDictDetail record);
}