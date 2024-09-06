package com.elephantScrape.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elephantScrape.demo.entity.UserDetailsArtistSubmission;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface UserDetailsRepository 
extends JpaRepository<UserDetailsArtistSubmission, Long> 
{
}
