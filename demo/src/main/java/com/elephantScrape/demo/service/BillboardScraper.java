package com.elephantScrape.demo.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BillboardScraper {
	public String scrapeBillboardTitles() {
        StringBuilder result = new StringBuilder();
        try {
            // Connect to the URL and fetch the document
            Document doc = Jsoup.connect("https://www.billboard.com/charts/billboard-200/").get();

            // Select elements with the id 'title-of-a-story'
            Elements titles = doc.select("#title-of-a-story");

            // Append the captured elements' text to the StringBuilder
            for (Element title : titles) {
                result.append(title.text()).append("\n" + " , ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "An error occurred while scraping.";
        }

        // Return the concatenated result as a string
        return result.toString();
    }
}