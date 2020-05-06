package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.newer.dao.OutputcheckMapper;
import com.newer.domain.Outputcheck;
import com.newer.domain.Shoes;
import com.newer.service.OutputcheckService;

public class OutputcheckServiceImpl implements OutputcheckService{
	@Autowired
	private OutputcheckMapper outputcheckMapper;
	@Override
	public List<Outputcheck> find() {
		List<Outputcheck> outputchecks=this.outputcheckMapper.selectAll();
		return outputchecks;
	}

	@Override
	public boolean save(Outputcheck outputcheck) {
		return this.outputcheckMapper.insert(outputcheck)>0?true:false;
	}

	@Override
	public boolean update(Outputcheck outputcheck) {
		return this.outputcheckMapper.updateByPrimaryKey(outputcheck)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.outputcheckMapper.deleteByPrimaryKey(id)>0?true:false;
	}
	
}
