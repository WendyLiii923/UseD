package com.wendy.used.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendy.used.model.Member;
import com.wendy.used.model.dao.MemberRepository;

@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/members")
    public List<Member> members() {
        return memberRepository.findAll();
    }

    @GetMapping("/member/{id}")
    public ResponseEntity<?> getMember(@PathVariable Integer id) {
        Optional<Member> member = memberRepository.findById(id);
        return member.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}