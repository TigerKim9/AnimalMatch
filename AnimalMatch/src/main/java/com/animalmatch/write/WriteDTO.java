package com.animalmatch.write;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WriteDTO {
	
	//글고유번호
	private Long writeUid;
	
	//유저고유번호
	private Long userUid;
	
	//유저이름
	private String userName;
	
	//유저유형
	private short userStatus;
	
	//글제목
	private String writeTitle;
	
	//글 내용
	private String writeContent;
	
	//글 작성날짜
	private LocalDateTime writeDate;

}
