package com.dj.sd.controller.login;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dj.sd.domain.LoginVO;
import com.dj.sd.service.login.LoginService;

/*
 * 로그인 컨트롤러
 * @author JeongHwa
 * */
@RestController // 모델앤뷰
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	// 로그인 폼 화면
	@GetMapping("/loginForm")
	public ModelAndView getloginFor() {

		ModelAndView mav = new ModelAndView();

		LoginVO loginVO = new LoginVO();
		mav.addObject("loginVO", loginVO);
		
		// mav.setView("뷰의 경로")
		mav.setViewName("/login/loginForm"); // 뷰의 이름(/login/loginForm.jsp)

		return mav;

	}

	// 로그인 진행
	@PostMapping("/loginAct")
	public ModelAndView login(@Validated @ModelAttribute LoginVO loginVO, BindingResult result, HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		System.out.println("컨트롤러에서" + loginVO.getUserId());
		if (result.hasErrors() || loginVO.getUserId() == null) {
			System.out.println("로그인 err");
			mav.setViewName("/login/loginForm");
			mav.addObject("valid_userId", "아이디가 존재하지 않습니다.");
			return mav;
		}
		mav = loginService.login(loginVO, session);
		System.out.println("로그인진행");
		return mav;
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	// 아이디 찾기 화면
	@RequestMapping("/checkId")
	public ModelAndView checkId() {

		ModelAndView mav = new ModelAndView();

		// mav.setView("뷰의 경로")
		mav.setViewName("/login/checkId"); // 뷰의 이름(/login/checkId.jsp)

		return mav;

	}
}
