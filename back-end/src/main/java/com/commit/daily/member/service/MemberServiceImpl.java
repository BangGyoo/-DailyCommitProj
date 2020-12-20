package com.commit.daily.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commit.daily.repository.dto.Member;
import com.commit.daily.repository.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper mapper;
	
	public int signUp(Member member) {
		return mapper.signUp(member);
	}
	public Member login(Member member) {
		return mapper.login(member);
	}
	
}
