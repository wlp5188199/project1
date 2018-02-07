package com.lanou.bean;

import java.util.Date;

public class MenuBean {

	/**
	 * 菜单id
	 */
	private int id;
	/**
	 * 菜单名称
	 */
	private String name;
	/**
	 * 菜单的key
	 */
	private String urlkey;
	/**
	 * 父级名称（上级菜单）
	 */
	private String parentName;
	/**
	 * 菜单类型
	 */
	private String type;
	/**
	 * 菜单链接地址
	 */
	private String url;
	/**
	 * 菜单创建时间
	 */
	private Date createTime;
	/**
	 * 创建者姓名
	 */
	private String createName;
	/**
	 * 菜单排序
	 */
	private int sort;
	/**
	 * 菜单状态
	 */
	private int STATUS;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getUrlkey() {
		return urlkey;
	}

	public void setUrlkey(String urlkey) {
		this.urlkey = urlkey;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}

}
