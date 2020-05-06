package com.newer.service;

import java.util.List;
import com.newer.domain.Backuser;

public interface BackuserService {
	public List<Backuser> find();

	public boolean save(Backuser backuser);
	
	public boolean update(Backuser backuser);
	
	public boolean delete(Integer id);
}
