package com.elephantScrape.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.elephantScrape.demo.entity.Block;
import com.elephantScrape.demo.entity.Player;
import com.elephantScrape.demo.service.BlockService;
import com.elephantScrape.demo.service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/api/game")
@CrossOrigin
public class GameController {
    private final PlayerService playerService;
    private final BlockService blockService;

    public GameController(PlayerService playerService, BlockService blockService) {
        this.playerService = playerService;
        this.blockService = blockService;
    }

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping("/players")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    @GetMapping("/blocks")
    public List<Block> getBlocks() {
        return blockService.getAllBlocks();
    }

    @PostMapping("/blocks")
    public Block placeBlock(@RequestBody Block block) {
        return blockService.saveBlock(block);
    }
}
