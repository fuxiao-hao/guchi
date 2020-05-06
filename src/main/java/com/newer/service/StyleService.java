package com.newer.service;

import java.util.List;
import com.newer.domain.Style;

public interface StyleService {
	public List<Style> find();

	public boolean save(Style style);
	
	public boolean update(Style style);
	
	public boolean delete(Integer id);
}
