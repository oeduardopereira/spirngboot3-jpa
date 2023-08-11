package com.eduardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.course.enteties.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
