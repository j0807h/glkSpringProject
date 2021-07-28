package com.dj.sd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.sd.mapper.SignUpMapper;

/**
 * @author DEREK
 *
 * 회원가입 서비스
 */
@Service
public class SignUpService {

	@Autowired
	SignUpMapper signUpMapper;
	
	
}
