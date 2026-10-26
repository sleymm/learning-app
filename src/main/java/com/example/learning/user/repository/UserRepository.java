package com.example.learning.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learning.user.model.User;


public interface UserRepository extends JpaRepository<User, Long> {}
