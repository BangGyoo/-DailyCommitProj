package com.commit.daily.member.service;

import com.commit.daily.repository.dto.Member;

public interface MemberService {
	int signUp(Member member);
	Member login(Member member);
	
}
