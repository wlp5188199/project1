package com.lanou.bean;

import java.util.Date;

public class OwnerBean implements java.io.Serializable {

	/**
	 *
	 * @mbg.generated Tue Dec 26 10:20:04 CST 2017
	 */
	private Integer id;

	/**
	 * 业主姓名
	 */
	private String name;

	/**
	 * 身份证号
	 */
	private String idCard;

	/**
	 * 性别，0男1女
	 */

	private String sex;

	/**
	 * 手机号
	 */
	private String tel;

	/**
	 * 小区编码
	 */
	private String housing_estate;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 积分
	 */
	private Integer score;

	/**
	 * 微信openid
	 */
	private String openid;

	/**
	 * 创建时间
	 */
	private Date create_time;

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

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex.equals("sex_1") ? "女" : "男";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

}
