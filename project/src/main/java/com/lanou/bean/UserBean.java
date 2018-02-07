package com.lanou.bean;

import java.util.Date;

/**
 * 用户列表 java Bean
 * 
 * @author liupe
 *
 */
public class UserBean implements java.io.Serializable {

	/**
	 * 用户id
	 */
	private Integer id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 用户电话
	 */
	private String tel;
	/**
	 * 用户状态
	 */
	private Integer state;
	/**
	 * 角色名
	 */
	private String roleName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 用户邮箱
	 */
	private String email;
	/**
	 * 用户真实姓名
	 */
	private String realName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

}
