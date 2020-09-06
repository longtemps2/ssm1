package com.atlt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.atlt.beans.Users;
import com.atlt.mapper.UsersMapper;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private UsersMapper um;
	public Users getUser() {
		
		Users u = um.getUsersById(1);
		return u;
	}
}
