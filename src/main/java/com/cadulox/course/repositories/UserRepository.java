package com.cadulox.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadulox.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
