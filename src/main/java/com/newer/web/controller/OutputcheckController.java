package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.domain.Outputcheck;
import com.newer.domain.Shoes;
import com.newer.dto.AccountDto;
import com.newer.dto.MsgDto;
import com.newer.service.AccountService;
import com.newer.service.OutputcheckService;

@RestController
@RequestMapping("/outputcheck")
public class OutputcheckController {
    @Autowired
    private OutputcheckService outputcheckService;
    
    @RequestMapping("/find")
    public List<Outputcheck> find(){
    	return outputcheckService.find();
    }
    
    @RequestMapping("/save")
	public MsgDto save(Outputcheck outputcheck) {
		boolean bool= this.outputcheckService.save(outputcheck);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
   	public MsgDto update(Outputcheck outputcheck) {
   		boolean bool= this.outputcheckService.update(outputcheck);
   		if (bool) {
   			return new MsgDto(true,"修改成功");
   		} else {
   			return new MsgDto(true,"修改失败");
   		}
   	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.outputcheckService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
    
}
