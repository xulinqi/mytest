package cn.itcast.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.dao.CustDao;
import cn.itcast.domain.Customer;

public class CustDaoImpl extends HibernateDaoSupport implements CustDao {

	@Override
	public Customer getById(Long custId) {
		return getHibernateTemplate().get(Customer.class, custId);
	}

}
