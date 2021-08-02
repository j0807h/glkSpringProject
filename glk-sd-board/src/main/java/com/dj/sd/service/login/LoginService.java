package com.dj.sd.service.login;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.dj.sd.domain.LoginVO;
import com.dj.sd.mapper.LoginMapper;

/*
 * 로그인 진행 서비스
 * @author JeongHwa
 * */
@Service
public class LoginService {
	@Autowired
	private LoginMapper loginMapper;
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	/*
	 * 로그인 진행
	 * @param 
	 * */
	public ModelAndView login(LoginVO loginVO, HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		// 아이디,비밀번호 입력여부 체크
		if(loginVO.getUserId() != null || loginVO.getUserPw() != null) {
				
			// 아이디가 DB에 있는지 체크(없을경우)
			List<LoginVO> list = loginMapper.getUser(loginVO);
			String userId = list.get(0).getUserId();
			String userPw = list.get(0).getUserPw();
			String userName = list.get(0).getName();
			
			System.out.println("====service====");
			System.out.println("userId : " + loginVO.getUserId());
			System.out.println("userPw : " + userPw);
			
			if(loginVO.getUserId() == null) {
				//DB에 저장된 아이디가 없으면
				System.out.println("아이디 없음");
				mav.addObject("not_userId", "아이디가 존재하지 않습니다." );
				mav.setViewName("/login/loginForm");
			} else if((loginVO.getUserPw()).equals(userPw)) {
				// 비밀번호가 일치하면
				LoginVO loginInfo = new LoginVO();
				session.setAttribute("loginInfo", loginInfo);
				mav.addObject("name", userName);
				mav.setViewName("/board/boardList");
			} else {
				// 비밀번호 틀림
	//			System.out.println("비밀번호 틀림");
				mav.addObject("valid_userPw", "비밀번호가 다릅니다.");
				mav.setViewName("/login/loginForm");
			}
		} else {
			//아이디, 비밀번호가 null이라면
			mav.setViewName("login/loginForm");
		}
		
		return mav;
		
	}
}
