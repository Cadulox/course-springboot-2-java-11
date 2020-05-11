package com.cadulox.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadulox.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
