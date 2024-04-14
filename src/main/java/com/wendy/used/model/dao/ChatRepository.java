package com.wendy.used.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.used.model.Chat;

public interface ChatRepository extends JpaRepository<Chat, Integer> {

}
