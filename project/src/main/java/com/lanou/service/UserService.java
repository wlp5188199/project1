package com.lanou.service;

import com.lanou.datatables.DataTables;
import com.lanou.entity.SysUser;

public interface UserService {

	/**
	 * 根据id获取用户信息
	 * 
	 * @param id
	 * @return
	 */
	public SysUser selectUserByNameAndPwd(String username, String password);

}
