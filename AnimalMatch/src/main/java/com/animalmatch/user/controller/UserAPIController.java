package com.animalmatch.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animalmatch.user.User;
import com.animalmatch.user.mapper.UserMapper;

@RestController
public class UserAPIController {
	
	UserMapper userMapper;
	
	
	//User 받아 회원등록
	@PostMapping("/addUser")
	public int addUser(User user) {
		int result = userMapper.addUser(user);
		return result;
	}

}
