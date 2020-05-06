package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.dto.AccountDto;
import com.newer.dto.MsgDto;
import com.newer.service.AccountService;

@RestController
@RequestMapping("/account")
public class StyleController {
    @Autowired
    private AccountService accountService;
    
    @RequestMapping("/find")
    public List<Account> find(){
    	return accountService.find();
    }
    @RequestMapping("/findselect")
	public Account findselect(String phone, String passward) {
		return accountService.findselect(phone, passward);
	}
    @RequestMapping("/save")
	public MsgDto save(Account account) {
		boolean bool= this.accountService.save(account);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.accountService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
    @RequestMapping("/pagecheck")
	public PageInfo<Account> pagecheck(AccountDto accoutDto) {
		return pagecheck(accoutDto);
	}
}
