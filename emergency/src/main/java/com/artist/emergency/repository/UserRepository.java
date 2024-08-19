package com.artist.emergency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artist.emergency.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}