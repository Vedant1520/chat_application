package com.involveininnovation.chat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.involveininnovation.chat.model.Message;

@Repository
public interface ChatRepository extends JpaRepository<Message, Long> {

    List<Message> findByReceiverName(String receiverName);
}
