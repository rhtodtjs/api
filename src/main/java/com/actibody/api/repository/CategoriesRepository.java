package com.actibody.api.repository;

import com.actibody.api.model.Categories;
import com.actibody.api.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("categoriesRepository")
public interface CategoriesRepository extends JpaRepository<Categories,Long> {
}
