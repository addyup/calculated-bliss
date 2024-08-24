package com.elegantScrape.message.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.elegantScrape.message.model.Event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventScraperService {

    private static final String URL = "https://www.dreamville.com/events/";

    public Elements scrapeDreamvilleEvents() throws IOException {
        List<Event> events = new ArrayList<>();

        Document doc = Jsoup.connect(URL).get();
        Elements eventElements = doc.select(".the-events");  

        return eventElements;
    }
}
