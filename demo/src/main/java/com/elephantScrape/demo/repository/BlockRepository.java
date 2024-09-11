package com.elephantScrape.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elephantScrape.demo.entity.Block;

public interface BlockRepository extends JpaRepository<Block, Long> {
}
