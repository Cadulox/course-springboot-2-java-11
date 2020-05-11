package com.cadulox.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadulox.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
