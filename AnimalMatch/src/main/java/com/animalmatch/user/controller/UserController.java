package com.animalmatch.user.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.animalmatch.config.PrincipalDetails;
import com.animalmatch.user.User;
import com.animalmatch.user.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/animalMatch")
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("signUp")
	public String signUp(User user,
			@AuthenticationPrincipal PrincipalDetails loginUser) {
		if(loginUser == null) {
			return "sign_up";
			
		}
		else {
			return "sign/main";
		}
	}

	public String main(Model model,User user
			,@AuthenticationPrincipal PrincipalDetails loginUser) {
		model.addAttribute(loginUser.getUsername());
		return "sign/main";
	}
}
