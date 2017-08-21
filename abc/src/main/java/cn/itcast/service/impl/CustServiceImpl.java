package cn.itcast.service.impl;

import cn.itcast.dao.CustDao;
import cn.itcast.domain.Customer;
import cn.itcast.service.CustService;

public class CustServiceImpl implements CustService {
	private CustDao custDao;
	
	public CustDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustDao custDao) {
		this.custDao = custDao;
	}

	@Override
	public Customer getById(Long custId) {
		return custDao.getById(custId);
	}

}
