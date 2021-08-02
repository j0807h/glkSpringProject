package com.dj.sd.service.login;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dj.sd.domain.LoginVO;
import com.dj.sd.domain.UserVO;
import com.dj.sd.mapper.LoginMapper;

/*
 * 로그인 진행 서비스
 * @author JeongHwa
 * */
@Service
public class LoginService {
//	@Autowired
//	private LoginMapper loginMapper;
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	/*
	 * 로그인 진행
	 * @param 
	 * */
	public String login(LoginVO loginVO, HttpSession session, Model model) throws Exception {
//		List<UserVO> userVO = loginMapper.getUser(loginVO);
		
		return "";
	}
}
