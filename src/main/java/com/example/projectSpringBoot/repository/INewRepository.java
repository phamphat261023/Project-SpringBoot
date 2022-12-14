package com.example.projectSpringBoot.repository;

import com.example.projectSpringBoot.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INewRepository extends JpaRepository<News, Long> {
}
