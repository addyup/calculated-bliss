package com.elephantScrape.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephantScrape.demo.entity.Artist;
import com.elephantScrape.demo.repository.ArtistRepository;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
@CrossOrigin
public class ArtistController {

    @Autowired
    private ArtistRepository artistRepository;

    @PostMapping
    public Artist registerArtist(@RequestBody Artist artist) {
        return artistRepository.saveAndFlush(artist);
    }

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}