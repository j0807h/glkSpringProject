package com.dj.sd.mapper;

import org.springframework.stereotype.Repository;

import com.dj.sd.domain.UserVO;

/**
 * @author DEREK
 * 
 * Sign Up(회원가입) Mapper Interface
 * Using Type UserVO
 * DB Methods
 */
@Repository
public interface SignUpMapper {
	
	/**
	 * @param userVo
	 * @throws Exception
	 * 
	 * 회원가입
	 * 
	 */
	public void insertUserInfo(UserVO userVo) throws Exception;
	
	/**
	 * @param userVo
	 * @return 찾는 아이디
	 * @throws Exeption
	 * 
	 * 아이디 조회
	 * 
	 */
	public String selectUserId(UserVO userVo) throws Exception;	
}