package com.lanou.bean;

import java.util.Date;

public class ScrapCollectorBean {

	/**
	 * 废品回收员id
	 */
	private int id;
	/**
	 * 废品回收员姓名
	 */
	private String name;
	/**
	 * 废品回收员性别
	 */
	private String sexval;
	/**
	 * 废品回收员身份证号
	 */
	private String idCard;
	/**
	 * 废品回收员电话
	 */
	private String tel;
	/**
	 * 所属小区名称
	 */
	private String housing_estate;
	/**
	 * 微信号
	 */
	private String openid;
	/**
	 * 收入
	 */
	private String income;
	/**
	 * 创建时间
	 */
	private Date create_time;

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

	public String getSexval() {
		return sexval;
	}

	public void setSexval(String sexval) {
		this.sexval = sexval.equals("sex_0") ? "男" : "女";
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	

	public String getHousing_estate() {
		return housing_estate;
	}

	public void setHousing_estate(String housing_estate) {
		this.housing_estate = housing_estate;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

}