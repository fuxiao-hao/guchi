package com.newer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.newer.dao.EarningsinfoMapper;
import com.newer.domain.Earningsinfo;
import com.newer.service.EarningsinfoService;

public class EarningsinfoServiceImpl implements EarningsinfoService{
	@Autowired
	private EarningsinfoMapper earningsinfoMapper;
	@Override
	public List<Earningsinfo> find() {
		List<Earningsinfo> earningsinfos=this.earningsinfoMapper.selectAll();
		return earningsinfos;
	}

	@Override
	public boolean save(Earningsinfo earningsinfo) {
		return this.earningsinfoMapper.insert(earningsinfo)>0?true:false;
	}

	@Override
	public boolean update(Earningsinfo earningsinfo) {
		return this.earningsinfoMapper.updateByPrimaryKey(earningsinfo)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.earningsinfoMapper.deleteByPrimaryKey(id)>0?true:false;
	}
	
}
