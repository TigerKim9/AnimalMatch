package com.animalmatch.write.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.animalmatch.config.PrincipalDetails;
import com.animalmatch.user.UserDTO;
import com.animalmatch.write.Write;
import com.animalmatch.write.service.WriteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class WriteAPIController {
	
	private final WriteService writeService;
	
	@PostMapping("/write")
	public int write(Model model, UserDTO userDTO, 
			@RequestBody Write write
			,@AuthenticationPrincipal PrincipalDetails loginUser
			) {
		int result = writeService.write(write);
		
		return result;
	}
	

}
