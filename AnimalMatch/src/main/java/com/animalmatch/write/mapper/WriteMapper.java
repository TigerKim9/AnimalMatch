package com.animalmatch.write.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.animalmatch.write.Write;

@Mapper
public interface WriteMapper {

	//글쓰기
	int write(Write write);
	
	
	
}
