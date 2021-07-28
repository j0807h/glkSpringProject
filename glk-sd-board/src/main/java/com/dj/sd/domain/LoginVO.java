package com.dj.sd.domain;


import lombok.Data;
/*
 * lombok을 이용해 보자
 * 1. 이클립스 경로에 lombok.jar 넣어주기 ( C:\Users\gfdfg\eclipse\jee-2021-06\eclipse )
 * 2. eclipse.ini 파일에 -javaagent:lombok.jar 적어주고 이클립스 재실행
 * */ 

/*
 * 로그인 도메인
 * @author JeongHwa
 * */

@Data //lombok 선언
public class LoginVO {
	/* 아이디 */
	private String id;
	
	/* 비밀번호 */
	private String pw;
	
	/* 이름 */
	private String name;
}
