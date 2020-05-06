package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.domain.Backuser;
import com.newer.domain.Earningsinfo;
import com.newer.dto.AccountDto;
import com.newer.dto.MsgDto;
import com.newer.service.AccountService;
import com.newer.service.BackuserService;

@RestController
@RequestMapping("/backuser")
public class BackuserController {
    @Autowired
    private BackuserService backuserService;
    
    @RequestMapping("/find")
    public List<Backuser> find(){
    	return backuserService.find();
    }
  
    @RequestMapping("/save")
	public MsgDto save(Backuser backuser) {
		boolean bool= this.backuserService.save(backuser);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
   	public MsgDto update(Backuser backuser) {
   		boolean bool= this.backuserService.update(backuser);
   		if (bool) {
   			return new MsgDto(true,"修改成功");
   		} else {
   			return new MsgDto(true,"修改失败");
   		}
   	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.backuserService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
    
}
