package com.animalmatch.write;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Reply {
	
	//답글고유번호
	private Long replyUid;
	
	//답글러고유번호
	private Long userUid;
	
	private String userName;

	//유저유형
	private short userStatus;
	
	//글고유번호
	private Long writeUid;
	
	//답글 내용
	private String replyContent;
	
	//답글 작성날짜
	private LocalDateTime replyDate;

}
