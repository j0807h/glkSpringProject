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
	 */
	public void signUp(UserVO userVo) throws Exception;
}