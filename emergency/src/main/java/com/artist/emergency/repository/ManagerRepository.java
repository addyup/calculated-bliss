package com.artist.emergency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artist.emergency.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}