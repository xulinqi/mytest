package cn.itcast.dao;

import cn.itcast.domain.Customer;

public interface CustDao {

	Customer getById(Long custId);

}
