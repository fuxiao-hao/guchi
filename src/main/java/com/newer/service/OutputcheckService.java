package com.newer.service;

import java.util.List;
import com.newer.domain.Outputcheck;

public interface OutputcheckService {
	public List<Outputcheck> find();

	public boolean save(Outputcheck outputcheck);
	
	public boolean update(Outputcheck outputcheck);
	
	public boolean delete(Integer id);
}
