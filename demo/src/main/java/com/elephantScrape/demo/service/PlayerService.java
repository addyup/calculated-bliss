package com.elephantScrape.demo.service;


import org.springframework.stereotype.Service;

import com.elephantScrape.demo.entity.Player;
import com.elephantScrape.demo.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    // Additional methods for player movement and interaction
}
