package com.dj.sd.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dj.sd.service.login.FindService;

/*
 * 아이디 찾기 컨트롤러
 * @author JeongHwa
 * */
@RestController
@RequestMapping(value = "/login")
public class FindIdController {
	
	@Autowired
	FindService findService;
	
	
	/*
	 * 비밀번호 찾기전 DB에 존재하는 아이디인지 찾기
	 */
//	@RequestMapping(value = "findId", method = RequestMethod.POST)
	@PostMapping("/findId")
	public String findId(@RequestParam(value = "userId") String userId, Model model) throws Exception {
		findService.findId(userId, model);
		return "login/findId";
	}
	

//	/*
//	 * 아이디 찾기( 비밀번호 확인 )
//	 */
////	@RequestMapping(value = "checkPh", method = RequestMethod.GET)
//	@GetMapping("/checkPh")
//	public String checkPh() {
//		return "login/checkPh";
//	}

	
	
	
	
	
	
}