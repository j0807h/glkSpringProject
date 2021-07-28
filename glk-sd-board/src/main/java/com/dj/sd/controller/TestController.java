package com.dj.sd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dj.sd.domain.UserVO;
import com.dj.sd.service.TestService;

@RestController
@RequestMapping(value="user")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping(value="/{userFlag}")
	public UserVO get(@PathVariable int userFlag) {
		return testService.get(userFlag);
	}
}
