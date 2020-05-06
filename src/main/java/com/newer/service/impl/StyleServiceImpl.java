package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.newer.dao.StyleMapper;
import com.newer.domain.Style;
import com.newer.service.StyleService;



public class StyleServiceImpl implements StyleService{
	@Autowired
	private StyleMapper styleMapper;
	@Override
	public List<Style> find() {
		List<Style> styles=this.styleMapper.selectAll();
		return styles;
	}

	@Override
	public boolean save(Style style) {
		return this.styleMapper.insert(style)>0?true:false;
	}

	@Override
	public boolean update(Style style) {
		return this.styleMapper.updateByPrimaryKey(style)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.styleMapper.deleteByPrimaryKey(id)>0?true:false;
	}
	
}
