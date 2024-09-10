package com.elephantScrape.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elephantScrape.demo.service.BillboardScraper;

import java.io.IOException;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin
public class TicketController {

	@Autowired
    private BillboardScraper billboardScraper;

    @GetMapping("/scrape")
    public String scrapeTicketDetails() throws IOException {
        return billboardScraper.scrapeBillboardTitles();
    }
}
