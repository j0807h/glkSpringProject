package com.dj.sd.controller.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/*
 * 로그인 컨트롤러
 * @author JeongHwa
 * */
@RestController //모델앤뷰
@RequestMapping("/login")
public class LoginController {
	
	// 로그인 폼 화면
	@GetMapping("/loginForm")
	public ModelAndView getloginForm() {
		
		ModelAndView mav = new ModelAndView();
		
		//mav.setView("뷰의 경로")
		mav.setViewName("/login/loginForm"); //뷰의 이름(/login/loginForm.jsp)
		
		return mav;
		
	}
	
	// 아이디 찾기 화면
	@RequestMapping("/checkId")
	public ModelAndView checkId() {
		
		ModelAndView mav = new ModelAndView();
		
		//mav.setView("뷰의 경로")
		mav.setViewName("/login/checkId"); //뷰의 이름(/login/checkId.jsp)
		
		return mav;
		
	}
}
