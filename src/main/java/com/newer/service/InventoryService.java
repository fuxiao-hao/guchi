package com.newer.service;

import java.util.List;
import com.newer.domain.Inventory;

public interface InventoryService {
	public List<Inventory> find();

	public boolean save(Inventory inventory);
	
	public boolean update(Inventory inventory);
	
	public boolean delete(Integer id);
}
