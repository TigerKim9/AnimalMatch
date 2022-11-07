package com.animalmatch.write.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.animalmatch.write.Reply;
import com.animalmatch.write.ReplyDTO;
import com.animalmatch.write.Write;
import com.animalmatch.write.WriteDTO;

@Mapper
public interface WriteMapper {

	//글쓰기
	int write(Write write);
	
	//글 목록
	List<WriteDTO> writeList(/*검색DTO*/);
	
	//글 보기
	WriteDTO viewWrite(Long writeUid);
	
	//글 수정
	int updateWrite(Write write);
	
	//글 삭제
	int deleteWrite(/*삭제DTO or 로그인&글id param*/);
	
	/*------------------------------------댓글 기능-----------------------------------------*/
	//댓글 쓰기
	int reply(Reply reply);
	
	//댓글 목록
	List<ReplyDTO> replyList(Long writeUid);
	
	//댓글 수정
	int updateReply(Reply reply);
	
	//댓글 삭제
	int deleteReply(/*삭제DTO or 로그인&댓글id param*/);
	
}
