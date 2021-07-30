package com.dj.sd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dj.sd.domain.UserVO;
import com.dj.sd.service.SignUpService;

/**
 * @author DEREK
 *
 * Sign Up Controller (회원가입 컨트롤러)
 *
 */

////////////////RESTful API? 수정 필요
//////////////몰라서 일단 예전 방법으로 실행

@Controller
public class SignUpController {

	@Autowired
	SignUpService signUpService;

	@RequestMapping(value="/signUp", method=RequestMethod.GET)
	public String getSignUpForm() throws Exception
	{
		return "/login/signUpForm";
	}
	
	
	@RequestMapping(value="/signUpAct", method=RequestMethod.POST) 
	public String postSignUpForm(UserVO userVo, RedirectAttributes redirectAttributes) throws Exception
	{
		signUpService.signUp(userVo);
		return "test"; 
	}
	 
	
	/*
	 * @PostMapping("/signUp") public void signUp(@RequestBody UserVO userVo) throws
	 * Exception { signUpService.signUp(userVo); }
	 */
}
