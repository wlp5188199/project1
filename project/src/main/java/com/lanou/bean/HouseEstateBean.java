package com.lanou.bean;

public class HouseEstateBean {
	private Integer id;

	/**
	 * 小区编码
	 */
	private String code;

	/**
	 * 小区名称
	 */
	private String name;

	/**
	 * 住户数
	 */
	private String quantity;

	/**
	 * 省编码
	 */
	private String province_code;

	/**
	 * 市编码
	 */
	private String city_code;

	/**
	 * 详细地址
	 */
	private String address;

	/**
	 * 省的名字
	 */
	private String province_name;
	/**
	 * 城市名字
	 */
	private String city_name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince_name() {
		return province_name;
	}

	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getProvince_code() {
		return province_code;
	}

	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}

}
