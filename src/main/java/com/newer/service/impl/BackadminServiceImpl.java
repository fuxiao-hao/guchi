package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.newer.dao.BackadminMapper;
import com.newer.domain.Backadmin;
import com.newer.service.BackadminService;

public class BackadminServiceImpl implements BackadminService{
	@Autowired
	private BackadminMapper backadminMapper;
	@Override
	public List<Backadmin> find() {
		List<Backadmin> backadmins=this.backadminMapper.selectAll();
		return backadmins;
	}

	@Override
	public boolean save(Backadmin backadmin) {
		return this.backadminMapper.insert(backadmin)>0?true:false;
	}

	@Override
	public boolean update(Backadmin backadmin) {
		return this.backadminMapper.updateByPrimaryKey(backadmin)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.backadminMapper.deleteByPrimaryKey(id)>0?true:false;
	}
	
}
