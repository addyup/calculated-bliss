package com.elephantScrape.demo.service;

import org.springframework.stereotype.Service;

import com.elephantScrape.demo.entity.Block;
import com.elephantScrape.demo.repository.BlockRepository;

import java.util.List;

@Service
public class BlockService {
    private final BlockRepository blockRepository;

    public BlockService(BlockRepository blockRepository) {
        this.blockRepository = blockRepository;
    }

    public List<Block> getAllBlocks() {
        return blockRepository.findAll();
    }

    public Block saveBlock(Block block) {
        return blockRepository.save(block);
    }

    // Additional methods for block interactions
}
