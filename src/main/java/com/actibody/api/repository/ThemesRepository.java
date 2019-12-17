package com.actibody.api.repository;

import com.actibody.api.model.Themes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("themesRepository")
public interface ThemesRepository extends JpaRepository<Themes,Long> {
}
