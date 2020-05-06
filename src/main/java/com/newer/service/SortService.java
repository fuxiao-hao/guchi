package com.newer.service;

import java.util.List;
import com.newer.domain.Sort;

public interface SortService {
	public List<Sort> find();

	public boolean save(Sort sort);
	
	public boolean update(Sort sort);
	
	public boolean delete(Integer id);
}
