package com.dj.sd.controller.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dj.sd.service.login.IsExistService;

/*
 * 비밀번호 찾기 컨트롤러
 * @author JeongHwa
 * */
@RestController
@RequestMapping(value = "/login")
public class FindPwController {
	@Autowired
	IsExistService isExistService;
	
	
	// 아이디가 존재하는지
//	@RequestMapping(value = "isExist", method = RequestMethod.POST)
	@PostMapping("/isExist")
//	public String isExist(@RequestParam(value = "userId") String userId, Model model, HttpSession session) throws Exception {
	public ModelAndView isExist(@RequestParam(value = "userId") String userId, Model model, HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		isExistService.isExist(userId, model, session);
		
		mav.setViewName("/login/chk");
		return mav;
	}

	//연락처로 비밀번호 찾기
	@PostMapping("/authPh")
//	public ModelAndView authPh(@RequestParam(value = "userId") String userId, Model model) {
	public ModelAndView authPh(@RequestParam(value = "userId") String userId ) {
		ModelAndView mav = new ModelAndView();
//		model.addAttribute("userId", userId);
		mav.addObject("userId", userId);
		mav.setViewName("/login/authPh");
		return mav;
	}
	
}
