package com.dj.sd.service.login;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dj.sd.domain.LoginVO;
import com.dj.sd.mapper.LoginMapper;

/*
 * 아이디 존재 하는지 확인하기 위한 서비스
 * @author JeongHwa
 * */
@Service
public class IsExistService {
	@Autowired
	LoginMapper loginMapper;

	public void isExist(String userId, Model model, HttpSession session) throws Exception {
		Integer cnt = 0;
		LoginVO vo = new LoginVO();
		
		vo.setId(userId);
		List<LoginVO> list = loginMapper.getUser(vo);
		System.out.println("아이디찾기:" + list.get(0).getId());
		if(list.size() != 0) {
			cnt = 1;
			session.setAttribute("loginId",list.get(0).getId());
		}
		
		model.addAttribute("val", cnt);
	}
}
