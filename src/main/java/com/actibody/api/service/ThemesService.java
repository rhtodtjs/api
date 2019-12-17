package com.actibody.api.service;

import com.actibody.api.repository.ThemesRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ThemesService {
    @Resource(name = "themesRepository")
    public ThemesRepository themesRepository;
}
