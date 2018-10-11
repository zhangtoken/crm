package com.itheima.crm.dao;

import java.util.List;

import com.itheima.crm.domain.Customer;

public interface CustomerDao {

	/**
	 * 列出所有的客户
	 * @return
	 */
	List<Customer> findAll();
}
