package cn.itcast.web;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.domain.Customer;
import cn.itcast.service.CustService;

public class CustAction extends ActionSupport {
	private Long custId;
	private String custName;
	private CustService custService;
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public CustService getCustService() {
		return custService;
	}

	public void setCustService(CustService custService) {
		this.custService = custService;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getById(){
		Customer customer=custService.getById(custId);
		ServletActionContext.getRequest().setAttribute("customer", customer);
		return SUCCESS;
	}
}
