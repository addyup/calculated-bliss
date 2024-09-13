package com.elephantScrape.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephantScrape.demo.service.BillboardScraperService;

import java.io.IOException;
import java.util.List;

@RestController
public class BillboardController {

    @Autowired
    private BillboardScraperService billboardScraperService;

    @GetMapping("/top-songs")
    public List<String> getTopSongs() throws IOException {
        return billboardScraperService.getTopSongs();
    }
}
