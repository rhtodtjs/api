package com.actibody.api.controller;

import com.actibody.api.model.TestTable;
import com.actibody.api.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestRepository repository;

    @GetMapping(value = "/test")
    public void test(){

        TestTable t = repository.findByIdx(1L);
        System.out.println(t.toString());

        System.out.println(t.getText());
    }
}
