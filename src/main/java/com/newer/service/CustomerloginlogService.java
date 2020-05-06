package com.newer.service;

import java.util.List;
import com.newer.domain.Customerloginlog;

public interface CustomerloginlogService {
	public List<Customerloginlog> find();

	public boolean save(Customerloginlog customerloginlog);
	
	public boolean update(Customerloginlog customerloginlog);
	
	public boolean delete(Integer id);
}
