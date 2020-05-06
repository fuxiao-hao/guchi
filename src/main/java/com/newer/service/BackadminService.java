package com.newer.service;

import java.util.List;
import com.newer.domain.Backadmin;

public interface BackadminService {
	public List<Backadmin> find();

	public boolean save(Backadmin backadmin);
	
	public boolean update(Backadmin backadmin);
	
	public boolean delete(Integer id);
	
}
