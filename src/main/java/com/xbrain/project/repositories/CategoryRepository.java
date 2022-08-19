package com.xbrain.project.repositories;

import com.xbrain.project.entities.Category;
import com.xbrain.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
