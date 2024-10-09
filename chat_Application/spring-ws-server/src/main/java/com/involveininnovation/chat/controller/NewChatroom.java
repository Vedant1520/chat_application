package com.involveininnovation.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.involveininnovation.chat.model.Message;
import com.involveininnovation.chat.repository.ChatRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/V1")
public class NewChatroom {

    @Autowired
    private ChatRepository chatRepository;

    @GetMapping("/chatroom/public")
    public List<Message> receiveMessageList() {
        System.out.println("msg" + chatRepository.findByReceiverName("ALL"));
        return chatRepository.findByReceiverName("ALL");
    }
}
