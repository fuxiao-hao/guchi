package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.newer.dao.SortMapper;
import com.newer.domain.Sort;
import com.newer.service.SortService;

public class SortServiceImpl implements SortService{
	@Autowired
	private SortMapper sortMapper;
	@Override
	public List<Sort> find() {
		List<Sort> sorts=this.sortMapper.selectAll();
		return sorts;
	}

	@Override
	public boolean save(Sort sort) {
		return this.sortMapper.insert(sort)>0?true:false;
	}

	@Override
	public boolean update(Sort sort) {
		return this.sortMapper.updateByPrimaryKey(sort)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.sortMapper.deleteByPrimaryKey(id)>0?true:false;
	}
	
}
