package com.dj.sd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * 메인 화면을 지정하기 위한 컨트롤러
 * @author JeongHwa
 * */

@Controller
public class MainController {
	
	// 메인화면 == 로그인화면
	@GetMapping("/")
	public String goLogin() {
		return "redirect:/login/loginForm";
	}
}
