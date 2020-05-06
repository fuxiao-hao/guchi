package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.Account;
import com.newer.domain.Orders;
import com.newer.domain.Outputcheck;
import com.newer.dto.AccountDto;
import com.newer.dto.MsgDto;
import com.newer.service.AccountService;
import com.newer.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    
    @RequestMapping("/find")
    public List<Orders> find(){
    	return ordersService.find();
    }
    
    @RequestMapping("/save")
	public MsgDto save(Orders orders) {
		boolean bool= this.ordersService.save(orders);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
   	public MsgDto update(Orders orders) {
   		boolean bool= this.ordersService.update(orders);
   		if (bool) {
   			return new MsgDto(true,"修改成功");
   		} else {
   			return new MsgDto(true,"修改失败");
   		}
   	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.ordersService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
   
}
