package com.dj.sd.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dj.sd.domain.LoginVO;
import com.dj.sd.mapper.LoginMapper;

/*
 * 아이디, 비밀번호 찾기 관련 서비스
 * @author JeongHwa
 * */
@Service
public class FindService {
	@Autowired
	LoginMapper loginMapper;
	
	/*
	 * 아이디 찾기
	 *  : DB에 존재하는지 체크
	 */
	public void findId(String userId, Model model) throws Exception {
		LoginVO vo = loginMapper.findId(userId);
		model.addAttribute("loginVO", vo);
	}
}
