package com.dj.sd.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dj.sd.domain.LoginVO;


/*
 * 로그인 매퍼
 * @author JeongHwa
 * */
@Repository
public interface LoginMapper {

	
	//  아이디 찾기
	LoginVO findId(String userPh);
	
	//	아이디 확인
	LoginVO checkId(String userId) throws Exception;

	// 회원정보 존재 유무 확인
	List<LoginVO> getUser(LoginVO vo) throws Exception;

}
