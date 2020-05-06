package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.newer.domain.Address;
import com.newer.dto.MsgDto;
import com.newer.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    
    @RequestMapping("/find")
    public List<Address> find(){
    	return addressService.find();
    }
    @RequestMapping("/save")
	public MsgDto save(Address address) {
		boolean bool= this.addressService.save(address);
		if (bool) {
			return new MsgDto(true,"添加成功");
		} else {
			return new MsgDto(true,"添加失败");
		}
	}
    @RequestMapping("/update")
	public MsgDto update(Address address) {
		boolean bool= this.addressService.update(address);
		if (bool) {
			return new MsgDto(true,"修改成功");
		} else {
			return new MsgDto(true,"修改失败");
		}
	}
    @RequestMapping("/delete")
	public MsgDto delete(Integer id) {
    	boolean bool= this.addressService.delete(id);
		if (bool) {
			return new MsgDto(true,"删除成功");
		} else {
			return new MsgDto(true,"删除失败");
		}
	}
   
}
