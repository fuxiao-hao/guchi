package com.newer.service;

import java.util.List;
import com.newer.domain.Address;

public interface AddressService {
	public List<Address> find();

	public boolean save(Address address);
	
	public boolean update(Address address);
	
	public boolean delete(Integer id);

}