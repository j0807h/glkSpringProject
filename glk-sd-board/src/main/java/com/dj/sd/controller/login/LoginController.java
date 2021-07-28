package com.dj.sd.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 로그인 컨트롤러
 * @author JeongHwa
 * */
@RestController //모델앤뷰
//@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/loginForm")
	public String login() {
		return "login/login";
	}
}
