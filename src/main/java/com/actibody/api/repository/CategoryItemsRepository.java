package com.actibody.api.repository;

import com.actibody.api.model.CategoryItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("categoryItemsRepository")
public interface CategoryItemsRepository extends JpaRepository<CategoryItems,Long> {
}
