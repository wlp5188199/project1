package com.lanou.entity;

import java.util.Date;

public class ReclOrder {
    /**
     *订单id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private Integer id;

    /**
     *订单编号
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.order_no
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String order_no;

    /**
     *废品编码
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.scrap_code
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String scrap_code;

    /**
     *业主id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.owner_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String owner_id;

    /**
     *废品回收员id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.sc_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String sc_id;

    /**
     *废品分捡站id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.rd_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String rd_id;

    /**
     *回收数量
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.amount
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private Integer amount;

    /**
     *回收单位
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.unit
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String unit;

    /**
     *回收金额
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.money
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private Integer money;

    /**
     *回收金额
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.sc_status
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String sc_status;

    /**
     *回收标识（数据字典可查）
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.rd_status
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private String rd_status;

    /**
     *创建时间
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.create_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private Date create_time;

    /**
     *更新时间
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reclamation_order.update_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    private Date update_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.id
     *
     * @return the value of reclamation_order.id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.id
     *
     * @param id the value for reclamation_order.id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.order_no
     *
     * @return the value of reclamation_order.order_no
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getOrder_no() {
        return order_no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.order_no
     *
     * @param order_no the value for reclamation_order.order_no
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.scrap_code
     *
     * @return the value of reclamation_order.scrap_code
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getScrap_code() {
        return scrap_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.scrap_code
     *
     * @param scrap_code the value for reclamation_order.scrap_code
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setScrap_code(String scrap_code) {
        this.scrap_code = scrap_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.owner_id
     *
     * @return the value of reclamation_order.owner_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getOwner_id() {
        return owner_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.owner_id
     *
     * @param owner_id the value for reclamation_order.owner_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.sc_id
     *
     * @return the value of reclamation_order.sc_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getSc_id() {
        return sc_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.sc_id
     *
     * @param sc_id the value for reclamation_order.sc_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setSc_id(String sc_id) {
        this.sc_id = sc_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.rd_id
     *
     * @return the value of reclamation_order.rd_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getRd_id() {
        return rd_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.rd_id
     *
     * @param rd_id the value for reclamation_order.rd_id
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setRd_id(String rd_id) {
        this.rd_id = rd_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.amount
     *
     * @return the value of reclamation_order.amount
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.amount
     *
     * @param amount the value for reclamation_order.amount
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.unit
     *
     * @return the value of reclamation_order.unit
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.unit
     *
     * @param unit the value for reclamation_order.unit
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.money
     *
     * @return the value of reclamation_order.money
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.money
     *
     * @param money the value for reclamation_order.money
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.sc_status
     *
     * @return the value of reclamation_order.sc_status
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getSc_status() {
        return sc_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.sc_status
     *
     * @param sc_status the value for reclamation_order.sc_status
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setSc_status(String sc_status) {
        this.sc_status = sc_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.rd_status
     *
     * @return the value of reclamation_order.rd_status
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public String getRd_status() {
        return rd_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.rd_status
     *
     * @param rd_status the value for reclamation_order.rd_status
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setRd_status(String rd_status) {
        this.rd_status = rd_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.create_time
     *
     * @return the value of reclamation_order.create_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.create_time
     *
     * @param create_time the value for reclamation_order.create_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reclamation_order.update_time
     *
     * @return the value of reclamation_order.update_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reclamation_order.update_time
     *
     * @param update_time the value for reclamation_order.update_time
     *
     * @mbg.generated Tue Dec 26 10:20:04 CST 2017
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}