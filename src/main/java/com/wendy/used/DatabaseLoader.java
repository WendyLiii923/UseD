package com.wendy.used;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wendy.used.model.Member;
import com.wendy.used.model.dao.MemberRepository;

//@Component
//public class DatabaseLoader implements CommandLineRunner {
//
//    @Autowired
//    private MemberRepository memberRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//    Member member = new Member();
//    member.setName("abc");
//    member.setPassword("abc");
//    member.setEmail("abc");
//    member.setPhone("abc");
//    member.setAddress("abc");
//    member.setCreateTime(null);
//    memberRepository.save(member);
//
//    }
//}
