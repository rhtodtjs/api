package com.actibody.api.service;

import com.actibody.api.repository.TestRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {

    @Resource(name = "testRepository")
    public TestRepository testRepository;

}
