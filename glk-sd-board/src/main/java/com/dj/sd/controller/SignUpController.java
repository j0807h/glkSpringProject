package com.dj.sd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dj.sd.domain.UserVO;
import com.dj.sd.service.SignUpService;

/**
 * @author DEREK
 *
 * Sign Up Controller (회원가입 컨트롤러)
 *
 */
@RestController
@RequestMapping(value="/signUp")
public class SignUpController {

	@Autowired
	SignUpService signUpService;

	//회원가입 화면 가져오기
	@GetMapping
	public ModelAndView getSignUpForm() throws Exception
	{
		// ModelAndView 생성
		ModelAndView mav = new ModelAndView("/login/signUpForm");

		return mav;
	}

	//회원 생성
	@PostMapping("/signUpAct")
	public ModelAndView postSignUpForm(UserVO userVo) throws Exception 
	{
		//TODO 회원생성 후 완료되면 login view로 넘겨준다
		//임시로 "test.jsp"로 설정
		ModelAndView mav = new ModelAndView("test");
	
		//userVo에 id, pw, name, ph를 Spring이 자동으로 .jsp에서 읽어옴
		//읽어온걸 base로 service signUp 진행
		signUpService.signUp(userVo);
		
		return mav;
	}
}
