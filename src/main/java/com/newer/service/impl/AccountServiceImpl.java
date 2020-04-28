package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.AccountMapper;
import com.newer.domain.Account;
import com.newer.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountMapper accountMapper;

	@Override
	public List<Account> find() {
		List<Account> accounts=accountMapper.selectAll();
		return accounts;
	};

}
