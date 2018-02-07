package com.lanou.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色管理数据展示
 * 
 * @author Songkrangilt
 *
 */
// 继承序列化接口，以便以后用鎏的方式传输
public class RoleBean implements Serializable {

	/**
	 * 角色id
	 */
	private Integer id;
	/**
	 * 角色姓名
	 */
	private String name;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 创建人id
	 */
	private Integer create_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getCreate_id() {
		return create_id;
	}

	public void setCreate_id(Integer create_id) {
		this.create_id = create_id;
	}

}
