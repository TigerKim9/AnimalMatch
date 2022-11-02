package com.animalmatch.write.service;

import org.springframework.stereotype.Service;

import com.animalmatch.write.Write;
import com.animalmatch.write.mapper.WriteMapper;

@Service
public class WriteService {
	
	WriteMapper writeMapper;
	
	public int write(Write write) {
		int result = writeMapper.write(write);
		return result;
	}

}
