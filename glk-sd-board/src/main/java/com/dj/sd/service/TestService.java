package com.dj.sd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dj.sd.domain.UserVO;
import com.dj.sd.mapper.TestMapper;


@Service
public class TestService {
	
	@Autowired
	TestMapper mapper;
	
	public UserVO get(int userFlag) {
		return mapper.get(userFlag);
	}
	
}
