package com.commit.daily.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commit.daily.member.service.MemberService;
import com.commit.daily.repository.dto.Member;

@RestController("/member")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@PostMapping("/sign-up")
	public String signUp(Member member) { 
		int res = service.signUp(member);
		if( res == 1 ) {
			return "회원가입에 성공하였습니다.";
		}
		else {
			return "회원가입에 실패하셨습니다.";
		}
		
		
	}
	
	@PostMapping("/login")
	public Member login(Member member) {
		return service.login(member);
	}
	
	
	
}
