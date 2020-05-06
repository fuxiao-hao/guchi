package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.domain.Shoes;
import com.newer.domain.Sort;
import com.newer.dto.AccountDto;
import com.newer.dto.MsgDto;
import com.newer.service.AccountService;
import com.newer.service.ShoesService;

@RestController
@RequestMapping("/shoes")
public class ShoesController {
    @Autowired
    private ShoesService shoesService;
    
    @RequestMapping("/find")
    public List<Shoes> find(){
    	return shoesService.find();
    }
   
    @RequestMapping("/save")
	public MsgDto save(Shoes shoes) {
		boolean bool= this.shoesService.save(shoes);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
   	public MsgDto update(Shoes shoes) {
   		boolean bool= this.shoesService.update(shoes);
   		if (bool) {
   			return new MsgDto(true,"修改成功");
   		} else {
   			return new MsgDto(true,"修改失败");
   		}
   	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.shoesService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
  
}
