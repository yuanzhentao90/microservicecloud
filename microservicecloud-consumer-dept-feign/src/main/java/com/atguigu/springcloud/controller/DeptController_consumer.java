package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;

@RestController
@RequestMapping(value="consumer/dept")
public class DeptController_consumer {
	
	@Autowired
	private DeptClientService service;
	
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable long id) {
		return service.get(id);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Object add(Dept dept) {
		return service.add(dept);
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Dept> list(){
		return service.list();
	}
}
