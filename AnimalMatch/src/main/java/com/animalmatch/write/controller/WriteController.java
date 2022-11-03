package com.animalmatch.write.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.animalmatch.config.PrincipalDetails;
import com.animalmatch.user.User;
import com.animalmatch.write.service.WriteService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class WriteController {
	
	private final WriteService writeService;
	
	@GetMapping("/write")
	public String write(Model model, User user
			,@AuthenticationPrincipal PrincipalDetails loginUser
			) {
		user = loginUser.getUser();
		model.addAttribute("loginUser",user);
		return "write";
	}
	

}
