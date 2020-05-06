package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.newer.dao.BackuserMapper;
import com.newer.domain.Backuser;
import com.newer.service.BackuserService;

public class BackuserServiceImpl implements BackuserService{
	@Autowired
	private BackuserMapper backuserMapper;
	@Override
	public List<Backuser> find() {
		List<Backuser> backusers=this.backuserMapper.selectAll();
		return backusers;
	}
	@Override
	public boolean save(Backuser backuser) {
		return this.backuserMapper.insert(backuser)>0?true:false;
	}

	@Override
	public boolean update(Backuser backuser) {
		return this.backuserMapper.updateByPrimaryKey(backuser)>0?true:false;
	}
	@Override
	public boolean delete(Integer id) {
		return this.backuserMapper.deleteByPrimaryKey(id)>0?true:false;
	}

}
