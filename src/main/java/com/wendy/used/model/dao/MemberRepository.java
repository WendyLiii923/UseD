package com.wendy.used.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.used.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

}
