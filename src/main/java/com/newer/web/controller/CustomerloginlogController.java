package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.domain.Backadmin;
import com.newer.domain.Customerloginlog;
import com.newer.dto.AccountDto;
import com.newer.dto.MsgDto;
import com.newer.service.AccountService;
import com.newer.service.CustomerloginlogService;

@RestController
@RequestMapping("/customerloginlog")
public class CustomerloginlogController {
    @Autowired
    private CustomerloginlogService customerloginlogService;
    
    @RequestMapping("/find")
    public List<Customerloginlog> find(){
    	return this.customerloginlogService.find();
    }

    @RequestMapping("/save")
	public MsgDto save(Customerloginlog customerloginlog) {
		boolean bool= this.customerloginlogService.save(customerloginlog);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
	public MsgDto update(Customerloginlog customerloginlog) {
		boolean bool= this.customerloginlogService.update(customerloginlog);
		if (bool) {
			return new MsgDto(true,"修改成功");
		} else {
			return new MsgDto(true,"修改失败");
		}
	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.customerloginlogService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
 
}
