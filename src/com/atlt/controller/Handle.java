package com.atlt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atlt.beans.Users;
import com.atlt.service.Service;

@Controller
public class Handle {

	@Autowired
	Service service;
	
	@RequestMapping("/users")
	public String testHello(Map<String,Object> map) {
		Users user = service.getUser();
		map.put("user",user);
		return "success";
	}
}
