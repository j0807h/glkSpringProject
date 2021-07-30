package com.dj.sd.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dj.sd.domain.UserVO;
import com.dj.sd.mapper.SignUpMapper;

/**
 * @author DEREK
 *
 * 회원가입 서비스
 * 
 */
@Service
public class SignUpService {

	@Autowired
	SignUpMapper signUpMapper;
	
	/**
	 * @param userVo
	 * @throws Exception
	 * 
	 * 회원가입 method
	 * 중복회원이 아닐경우, 비밀번호 암호화 후 회원 등록
	 * 
	 */
	public void signUp(UserVO userVo) throws Exception
	{		
		if(!isDuplicate(userVo))
		{
			//USER_CO VARCHAR(200)이라 앞에 한자리 'u' 빼고 199자 랜덤 숫자 지정
			userVo.setUserCo('u' + getRandUserCo(199));
			
			//1: 현재회원, 0: 탈퇴
			userVo.setUserFlag(1);
			
			signUpMapper.insertUserInfo(encPwd(userVo));
		}
	}
	
	/**
	 * @param userVo
	 * @return 중복회원 체크
	 * @throws Exeption
	 * 
	 * 중복회원 체크 method (is duplicate)
	 * 
	 */
	private boolean isDuplicate(UserVO userVo) throws Exception
	{
		if(userVo.getUserId().equals(signUpMapper.selectUserId(userVo)))
		{
			return true;
		}
			
		return false;
	}
	
	/**
	 * @param userVo
	 * @return 암호화된 비밀번호 포함한 UserVO
	 * @throws Exception
	 */
	private UserVO encPwd(UserVO userVo) throws Exception
	{
		//variables
		String secPw;
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		//암호화
		//회원 비밀번호 encoding
		secPw = encoder.encode(userVo.getUserPw());
		
		//암호화 비밀번호 setting
		userVo.setUserPw(secPw);
		
		return userVo;
	}
	
	/**
	 * @param length
	 * @return 랜덤으로 생성된 length 만큼의 숫자 (회원코드 생성용)
	 */
	private String getRandUserCo(int length)
	{
		return RandomStringUtils.randomNumeric(length);
	}
}