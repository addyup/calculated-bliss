package com.elephantScrape.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elephantScrape.demo.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}