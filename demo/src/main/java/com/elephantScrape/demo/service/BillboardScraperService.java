package com.elephantScrape.demo.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BillboardScraperService {

    private static final String BILLBOARD_URL = "https://www.billboard.com/charts/billboard-200/";

    public List<String> getTopSongs() throws IOException {
        List<String> songs = new ArrayList<>();

        // Connect to the Billboard 200 page
        Document document = Jsoup.connect(BILLBOARD_URL).get();

        // Select the elements containing the song titles
        Elements songElements = document.select(".c-title");

        // Iterate through the elements and extract the song names
        for (Element songElement : songElements) {
            String songName = songElement.text();
            songs.add(songName);
        }

        return songs;
    }
}