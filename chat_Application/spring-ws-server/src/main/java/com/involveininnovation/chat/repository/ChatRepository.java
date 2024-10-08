package com.involveininnovation.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.involveininnovation.chat.model.Message;

@Repository
public interface ChatRepository extends JpaRepository<Message, Long> {

    // Optional<Message> findByEmail(String email);
}
