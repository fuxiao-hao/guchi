package com.newer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.OrdersMapper;
import com.newer.domain.Orders;
import com.newer.dto.OrdersDto;
import com.newer.service.OrdersService;

import tk.mybatis.mapper.entity.Example;


public class OrdersServiceImpl implements OrdersService{
	@Autowired
	private OrdersMapper ordersMapper;

	@Override
	public List<Orders> find() {
		List<Orders> orders=this.ordersMapper.selectAll();
		return orders;
	}

	@Override
	public boolean save(Orders orders) {
		return this.ordersMapper.insert(orders)>0?true:false;
	}

	@Override
	public boolean update(Orders orders) {
		return this.ordersMapper.updateByPrimaryKey(orders)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.ordersMapper.deleteByPrimaryKey(id)>0?true:false;
	}

	@Override
	public PageInfo<Orders> pagecheck(OrdersDto ordersDto) {
		PageHelper.startPage(ordersDto.getPage(), ordersDto.getPageSize());
		Example example=new Example(Orders.class);
		example.createCriteria().andEqualTo("", ordersDto);
		example.createCriteria().andEqualTo("", ordersDto);
		List<Orders> list=this.ordersMapper.selectAll();
		PageInfo<Orders> pageInfo=new PageInfo<Orders>(list);
		return pageInfo;
	}

	
}
