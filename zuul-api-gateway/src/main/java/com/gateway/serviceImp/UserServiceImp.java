package com.gateway.serviceImp;

import org.springframework.stereotype.Service;

import com.gateway.service.UserService;

@Service
public class UserServiceImp implements UserService {

	public String generateId(String fname,String lname) {
		String userId = fname + lname.substring(0, 2);
		return userId;
	}
}
