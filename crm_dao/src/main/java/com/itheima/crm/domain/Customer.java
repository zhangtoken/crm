package com.itheima.crm.domain;

/**
 * PO (Persistence Object)持久化类
 * 7个规范
 * 1. 公有类
 * 2. 公有无参构造方法
 * 3. 公有getter与setter
 * 4. 私有成员变量
 * 5. 如果是基础类型，使用包装类
 * 6. 不能用final修饰
 * 7. 实现java.io.Serializable接口
 */
public class Customer {

	private Long custId;
	private String custName;
	private String custPhone;
	private String custMobile;
	private String custImage;
	
	public Long getCustId() {
		
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
	public String getCustImage() {
		return custImage;
	}
	public void setCustImage(String custImage) {
		this.custImage = custImage;
	}
}
