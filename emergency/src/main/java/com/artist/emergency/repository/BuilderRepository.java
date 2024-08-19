package com.artist.emergency.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artist.emergency.model.Builder;

@Repository
public interface BuilderRepository extends JpaRepository<Builder, Long> {
}
