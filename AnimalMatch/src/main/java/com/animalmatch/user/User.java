package com.animalmatch.user;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
	
	//유저 고유번호
	private Long userUid;
	
	//유저 유형
	/*
	 * 0 = 유저
	 * 1 = 수의사
	 * 2 = 행동교정사
	 */
	private short userStatus;
	
	//유저아이디
	private String userId;
	
	//유저비밀번호
	private String userPw;
	
	//유저이름
	private String userName;
	
	//유저전화번호
	private String userPhone;
	
	//유저 이메일
	private String userEmail;
	
	//유저 주소
	private String userAddress;
	
	//성별
	private short userGender;
	
	//생년월일
	private LocalDateTime userBirth;
	
	//가입날짜
	private LocalDateTime regDate;

}
