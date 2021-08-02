package com.dj.sd.controller.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dj.sd.domain.LoginVO;
import com.dj.sd.service.login.LoginService;


/*
 * 로그인 컨트롤러
 * @author JeongHwa
 * */
@RestController //모델앤뷰
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	// 로그인 폼 화면
	@GetMapping("/loginForm")
	public ModelAndView getloginForm(Model model) {
		
		
		ModelAndView mav = new ModelAndView();
		
		LoginVO loginVO = new LoginVO();
		mav.addObject("loginVO", loginVO);
		//mav.setView("뷰의 경로")
		mav.setViewName("/login/loginForm"); //뷰의 이름(/login/loginForm.jsp)
		
		return mav;
		
	}
	
	
	// 로그인 진행
	@PostMapping("/loginAct")
	public String login(@ModelAttribute LoginVO loginVO, HttpSession session, Model model) throws Exception {
		
		
		loginService.login(loginVO, session, model);
		

		//		return "redirect : /board/boardList";
		return "로그인성공";
		
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
