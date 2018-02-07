package com.lanou.service;


import com.lanou.datatables.DataTables;

public interface ReclOrderService {

	 /**
     * 分页查询废品订单表
     * @return
     */
     DataTables selectPageReclOrder(DataTables d);
    
}
