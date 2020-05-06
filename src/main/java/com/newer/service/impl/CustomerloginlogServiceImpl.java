package com.newer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.newer.dao.CustomerloginlogMapper;
import com.newer.domain.Customerloginlog;
import com.newer.service.CustomerloginlogService;

public class CustomerloginlogServiceImpl implements CustomerloginlogService{
	@Autowired
	private CustomerloginlogMapper customerloginlogMapper;
	@Override
	public List<Customerloginlog> find() {
		List<Customerloginlog> customerloginlogs=this.customerloginlogMapper.selectAll();
		return customerloginlogs;
	}

	@Override
	public boolean save(Customerloginlog customerloginlog) {
		return this.customerloginlogMapper.insert(customerloginlog)>0?true:false;
	}

	@Override
	public boolean update(Customerloginlog customerloginlog) {
		return this.customerloginlogMapper.updateByPrimaryKey(customerloginlog)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.customerloginlogMapper.deleteByPrimaryKey(id)>0?true:false;
	}
	
}
