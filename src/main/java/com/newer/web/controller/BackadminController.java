package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.domain.Address;
import com.newer.domain.Backadmin;
import com.newer.dto.AccountDto;
import com.newer.dto.MsgDto;
import com.newer.service.AccountService;
import com.newer.service.BackadminService;

@RestController
@RequestMapping("/backadmin")
public class BackadminController {
    @Autowired
    private BackadminService backadminService;
    
    @RequestMapping("/find")
    public List<Backadmin> find(){
    	return this.backadminService.find();
    }
 
    @RequestMapping("/save")
	public MsgDto save(Backadmin backadmin) {
		boolean bool= this.backadminService.save(backadmin);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
	public MsgDto update(Backadmin backadmin) {
		boolean bool= this.backadminService.update(backadmin);
		if (bool) {
			return new MsgDto(true,"修改成功");
		} else {
			return new MsgDto(true,"修改失败");
		}
	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.backadminService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}

}
