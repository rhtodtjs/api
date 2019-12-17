package com.actibody.api.service;

import com.actibody.api.repository.TestRepository;
import com.actibody.api.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource(name = "userRepository")
    public UserRepository userRepository;
}
