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
 * DB Board Table
 */
@Data
public class BoardVO {

	//Database: snake_case 
	//VO: camelCase
	
	//primary key
	private String boardCo;
	
	//foreign key: User table - User Code
	private String userCo;
	
	private String boardSubj;
	private String boardCont;
	private String orgFName;
	private String storeFName;
	private int fSize;
	private int boardCnt;
	private String boardReg;
}
