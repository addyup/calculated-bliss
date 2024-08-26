package com.elegantScrape.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elegantScrape.message.service.EventScraperService;

import java.io.IOException;

@RestController
public class EventController {

    @Autowired
    private EventScraperService eventScraperService;


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/api/events/dreamville")
    public String getEvents() {
        try {
            return eventScraperService.scrapeDreamvilleEvents().toString().replaceAll("<[^>]*>", "");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
