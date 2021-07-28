package com.dj.sd.mapper;

import org.springframework.stereotype.Repository;

import com.dj.sd.domain.UserVO;

@Repository
public interface TestMapper {
	UserVO get(int userFlag);
}
