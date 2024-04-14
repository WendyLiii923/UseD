package com.wendy.used.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wendy.used.model.Member;
import com.wendy.used.model.dao.MemberRepository;
import com.wendy.used.model.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberRepository memberRepository;

	@Override
	public Member createMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public Member createMember(Member member) {
//		member.setCreateTime(null);
//		memberRepository.save(member);
//		return member;
//	}
	

}
