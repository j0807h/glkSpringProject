package com.dj.sd.domain;



import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	@NotNull(message = "아이디를 입력해 주세요")
	private String userId;
	
	/* 비밀번호 */
	@NotNull(message = "비밀번호를 입력해 주세요")
	private String userPw;
	
	/* 이름 */
	private String name;
	
	/* 
	 * 추후 관리자인지 회원인지 구분하기 위함.
	 * ( 관리자:0, 회원:1)
	 *  */
	private String grade;

	
	//생성자
	public LoginVO(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public LoginVO() {} //default 생성자
	

}
