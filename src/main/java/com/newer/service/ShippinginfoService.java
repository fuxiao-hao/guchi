package com.newer.service;

import java.util.List;
import com.newer.domain.Shippinginfo;

public interface ShippinginfoService {
	public List<Shippinginfo> find();

	public boolean save(Shippinginfo shippinginfo);
	
	public boolean update(Shippinginfo shippinginfo);
	
	public boolean delete(Integer id);
}
