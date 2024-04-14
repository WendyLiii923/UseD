package com.wendy.used.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendy.used.model.Member;
import com.wendy.used.model.dao.MemberRepository;
import com.wendy.used.model.service.MemberService;

@RestController
@RequestMapping("/api")
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;
//	@Autowired
//	private MemberService memberService;

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

//	@PostMapping("/member")
//	public ResponseEntity<Member> createMember(@Valid @RequestBody Member member) throws Exception {
//		Member result = memberService.createMember(member);
//		return ResponseEntity.ok().body(result);
//	}
//
//	@PutMapping("/member/{id}")
//	public ResponseEntity<Member> updateMember(@Valid @RequestBody Member member) {
//		Member result = memberRepository.save(member);
//		return ResponseEntity.ok().body(result);
//	}
//
//	@DeleteMapping("/member/{id}")
//	public ResponseEntity<?> deleteMember(@PathVariable Integer id) {
//		memberRepository.deleteById(id);
//		return ResponseEntity.ok().build();
//	}

}
