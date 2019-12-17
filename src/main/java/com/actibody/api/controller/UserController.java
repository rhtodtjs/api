package com.actibody.api.controller;

import com.actibody.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/find-user")
    public void findUser() {
        System.out.println("야캬컄");
        userRepository.findByUserId("test");
    }
}
