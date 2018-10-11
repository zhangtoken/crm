package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.domain.Customer;

/**
 * 客户业务接口
 *
 */
public interface CustomerService {

	/**
	 * 列出所有的客户
	 * @return
	 */
	List<Customer> findAll();
}
