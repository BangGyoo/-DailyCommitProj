package com.commit.daily.repository.mapper;

import com.commit.daily.repository.dto.Member;

public interface MemberMapper {
	
	int signUp(Member member);
	Member login(Member member);

}
