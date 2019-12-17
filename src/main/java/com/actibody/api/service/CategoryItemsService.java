package com.actibody.api.service;

import com.actibody.api.repository.CategoryItemsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CategoryItemsService {
    @Resource(name = "categoryItemsRepository")
    public CategoryItemsRepository categoryItemsRepository;
}
