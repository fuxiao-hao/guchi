package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.domain.Customerloginlog;
import com.newer.domain.Earningsinfo;
import com.newer.dto.AccountDto;
import com.newer.dto.MsgDto;
import com.newer.service.AccountService;
import com.newer.service.EarningsinfoService;

@RestController
@RequestMapping("/earningsinfo")
public class EarningsinfoController {
    @Autowired
    private EarningsinfoService earningsinfoService;
    
    @RequestMapping("/find")
    public List<Earningsinfo> find(){
    	return earningsinfoService.find();
    }

    @RequestMapping("/save")
	public MsgDto save(Earningsinfo earningsinfo) {
		boolean bool= this.earningsinfoService.save(earningsinfo);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
   	public MsgDto update(Earningsinfo earningsinfo) {
   		boolean bool= this.earningsinfoService.update(earningsinfo);
   		if (bool) {
   			return new MsgDto(true,"修改成功");
   		} else {
   			return new MsgDto(true,"修改失败");
   		}
   	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.earningsinfoService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
}
