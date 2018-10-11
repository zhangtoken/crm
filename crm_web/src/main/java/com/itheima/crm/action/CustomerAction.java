package com.itheima.crm.action;

import java.util.List;

import com.itheima.crm.domain.Customer;
import com.itheima.crm.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;

/**
 * 客户的action
 *
 */
public class CustomerAction {
	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String list(){
		List<Customer> list = customerService.findAll();
		ActionContext.getContext().put("list", list);
		return "list";
	}
}
