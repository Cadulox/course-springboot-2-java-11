package com.cadulox.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadulox.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
