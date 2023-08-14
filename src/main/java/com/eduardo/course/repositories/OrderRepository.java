package com.eduardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.course.enteties.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
