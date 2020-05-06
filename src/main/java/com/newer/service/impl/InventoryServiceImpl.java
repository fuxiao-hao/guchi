package com.newer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.newer.dao.InventoryMapper;
import com.newer.domain.Inventory;
import com.newer.service.InventoryService;

public class InventoryServiceImpl implements InventoryService{
	@Autowired
	private InventoryMapper inventoryMapper;
	@Override
	public List<Inventory> find() {
		List<Inventory> inventorys=this.inventoryMapper.selectAll();
		return inventorys;
	}

	@Override
	public boolean save(Inventory inventory) {
		return this.inventoryMapper.insert(inventory)>0?true:false;
	}

	@Override
	public boolean update(Inventory inventory) {
		return this.inventoryMapper.updateByPrimaryKey(inventory)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.inventoryMapper.deleteByPrimaryKey(id)>0?true:false;
	}
	
}
