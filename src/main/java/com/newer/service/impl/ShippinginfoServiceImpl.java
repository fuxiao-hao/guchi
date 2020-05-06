package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.newer.dao.ShippinginfoMapper;
import com.newer.dao.ShoesMapper;
import com.newer.domain.Shippinginfo;
import com.newer.domain.Shoes;
import com.newer.service.ShippinginfoService;

public class ShippinginfoServiceImpl implements ShippinginfoService{
	@Autowired
	private ShippinginfoMapper shippinginfoMapper;
	@Override
	public List<Shippinginfo> find() {
		List<Shippinginfo> shippinginfos=this.shippinginfoMapper.selectAll();
		return shippinginfos;
	}

	@Override
	public boolean save(Shippinginfo shippinginfo) {
		return this.shippinginfoMapper.insert(shippinginfo)>0?true:false;
	}

	@Override
	public boolean update(Shippinginfo shippinginfo) {
		return this.shippinginfoMapper.updateByPrimaryKey(shippinginfo)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.shippinginfoMapper.deleteByPrimaryKey(id)>0?true:false;
	}
	
}
