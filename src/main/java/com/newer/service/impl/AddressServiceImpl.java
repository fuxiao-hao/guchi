package com.newer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.newer.dao.AddressMapper;
import com.newer.domain.Address;
import com.newer.service.AddressService;

public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressMapper addressMapper;
	@Override
	public List<Address> find() {
		List<Address> addresss=this.addressMapper.selectAll();
		return addresss;
	}

	@Override
	public boolean save(Address address) {
		return this.addressMapper.insert(address)>0?true:false;
	}

	@Override
	public boolean update(Address address) {
		return this.addressMapper.updateByPrimaryKey(address)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.addressMapper.deleteByPrimaryKey(id)>0?true:false;
	}

}
