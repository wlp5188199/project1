package com.lanou.bean;

import java.util.Date;

public class ReclBean {

	/**
	 * 废品订单id
	 */
	private int id;
	/**
	 * 废品订单编码
	 */
	private String order_no;
	/**
	 * 业主姓名
	 */
	private String owner_name;
	/**
	 * 废品名称
	 */
	private String scrap_name;
	/**
	 * 回收数量
	 */
	private String amount;
	/**
	 * 废品状态的值
	 */
	private String sc_status_val;
	/**
	 * 废品回收站状态值
	 */
	private String rd_status_val;
	/**
	 * 废品订单创建时间
	 */
	private Date create_time;
	/**
	 * 废品订单更新时间
	 */
	private Date update_time;
	/**
	 * 回收单位
	 */
	private String unit;
	/**
	 * 回收金额
	 */
	private String money;
	/**
	 * 废品回收站id
	 */
	private String rd_id;
	/**
	 * 废品名称
	 */
	private String sc_name;

	public String getSc_name() {
		return sc_name;
	}

	public void setSc_name(String sc_name) {
		this.sc_name = sc_name;
	}

	public String getRd_id() {
		return rd_id;
	}

	public void setRd_id(String rd_id) {
		this.rd_id = rd_id;
	}

	public int getId() {
		return id;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getScrap_name() {
		return scrap_name;
	}

	public void setScrap_name(String scrap_name) {
		this.scrap_name = scrap_name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSc_status_val() {
		return sc_status_val;
	}

	public void setSc_status_val(String sc_status_val) {
		this.sc_status_val = sc_status_val;
	}

	public String getRd_status_val() {
		return rd_status_val;
	}

	public void setRd_status_val(String rd_status_val) {
		this.rd_status_val = rd_status_val;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

}
