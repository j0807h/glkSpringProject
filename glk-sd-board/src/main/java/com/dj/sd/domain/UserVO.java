package com.dj.sd.domain;

import lombok.Data;

/*
 * lombok을 이용해 보자
 * 1. 이클립스 경로에 lombok.jar 넣어주기	
 * 2. eclipse.ini 파일에 -javaagent:lombok.jar 적어주고 이클립스 재실행
 */

/*
 * @Data: lombok Declaration
 * 	      @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode을 한꺼번에 설정해주는 어노테이션 
 */

/**
 * @author DEREK
 * 
 * DB User Table
 * 
 */
@Data
public class UserVO {

	//Database: snake_case 
	//VO: camelCase
	
	//primary key
	private String userCo;
	
	private String userId;
	private String userPw;
	private String userName;
	private int userFlag;
}