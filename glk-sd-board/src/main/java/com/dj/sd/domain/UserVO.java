package com.dj.sd.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
	
	@NotBlank(message = "아이디가 입력되지 않았습니다")
	@Size(min = 3, max = 10, message = "아이디는 최소 3글자에서 최대 10글자까지 입력 가능합니다")
	@Pattern(regexp = "/^[A-Za-z0-9+]*$/", message = "아이디는 영문 및 숫자로만 생성이 가능합니다")
	private String userId;
	
	@NotBlank(message = "비밀번호가 입력되지 않았습니다")
	private String userPw;
	
	////TODO: 아직 정리안됌
	@NotBlank(message = "비밀번호가 입력되지 않았습니다")
	private String checkUserPw;
	
	@NotBlank(message = "이름이 입력되지 않았습니다")
	@Size(max = 25, message = "이름은 최대 25글자까지만 입력 가능합니다")
	@Pattern(regexp = "/^[가-힣+]*$/", message = "한글만 입력 가능합니다")
	private String userName;
	
	@NotBlank(message = "번호가 입력되지 않았습니다")
	//@Pattern(regexp = "(\\\\d{3})(\\\\d{3,4})(\\\\d{4})", message = "번호는 숫자로만 생성이 가능합니다 \n 번호 양식에 맞게 입력해주세요")
	private String userPh;
	
	private int userFlag;
}