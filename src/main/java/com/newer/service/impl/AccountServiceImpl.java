package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.AccountMapper;
import com.newer.domain.Account;
import com.newer.dto.AccountDto;
import com.newer.service.AccountService;

import tk.mybatis.mapper.entity.Example;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountMapper accountMapper;

	@Override
	public List<Account> find() {
		List<Account> accounts=this.accountMapper.selectAll();
		return accounts;
	}

	@Override
	public Account findselect(String phone, String passward) {
		Example example=new Example(Account.class);
		example.createCriteria().andEqualTo("phone", phone);
		example.createCriteria().andEqualTo("passward", passward);
		return this.accountMapper.selectOneByExample(example);
	}

	@Override
	public boolean save(Account account) {
		return this.accountMapper.insert(account)>0?true:false;
	}

	@Override
	public boolean delete(Integer id) {
		return this.accountMapper.deleteByPrimaryKey(id)>0?true:false;
	}


	@Override
	public PageInfo<Account> pagecheck(AccountDto accoutDto) {
		PageHelper.startPage(accoutDto.getPage(), accoutDto.getPageSize());
		Example example=new Example(Account.class);
		example.createCriteria().andEqualTo("", accoutDto);
		example.createCriteria().andEqualTo("", accoutDto);
		List<Account> list=this.accountMapper.selectAll();
		PageInfo<Account> pageInfo=new PageInfo<Account>(list);
		return pageInfo;
	};

}
