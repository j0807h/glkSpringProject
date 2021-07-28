package com.dj.sd.controller.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 로그인 컨트롤러
 * @author JeongHwa
 * */
@RestController
@RequestMapping("/login")
public class LoginController {
	@GetMapping
	public String login() {
		return "login/login";
	}
}
