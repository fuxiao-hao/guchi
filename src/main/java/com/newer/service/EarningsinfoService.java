package com.newer.service;

import java.util.List;
import com.newer.domain.Earningsinfo;

public interface EarningsinfoService {
	public List<Earningsinfo> find();

	public boolean save(Earningsinfo earningsinfo);
	
	public boolean update(Earningsinfo earningsinfo);
	
	public boolean delete(Integer id);
}
