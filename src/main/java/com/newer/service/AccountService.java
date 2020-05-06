package com.newer.service;

import java.util.List;
import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.dto.AccountDto;

public interface AccountService {
	public List<Account> find();

	public Account findselect(String phone, String passward);

	public boolean save(Account account);

	public boolean delete(Integer id);

	public PageInfo<Account> pagecheck(AccountDto accoutDto);
}
