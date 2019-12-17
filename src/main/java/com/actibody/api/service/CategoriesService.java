package com.actibody.api.service;

import com.actibody.api.repository.CategoriesRepository;
import com.actibody.api.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CategoriesService {
    @Resource(name = "categoriesRepository")
    public CategoriesRepository categoriesRepository;
}
