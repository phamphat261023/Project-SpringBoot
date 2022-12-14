package com.example.projectSpringBoot.repository;

import com.example.projectSpringBoot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
    Category findOneByCode(String code);
}
