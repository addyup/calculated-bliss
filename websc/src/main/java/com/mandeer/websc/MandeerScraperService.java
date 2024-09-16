package com.mandeer.websc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.mandeer.websc.model.Event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MandeerScraperService {

	private static final String URL = "https://www.dfwhindutemple.org/";

	public List<Event> scrapeUpcomingEvents() {
	    List<Event> events = new ArrayList<>();
	    Set<String> eventTitles = new HashSet<>(); // Set to track unique titles

	    try {
	        Document document = Jsoup.connect(URL).get();

	        // Use elementor-element class to find the events section
	        Elements eventElements = document.getElementsByClass("elementor-element");

	        for (Element element : eventElements) {
	            // Extract information for each event
	            String title = element.select("h2, h3, h4").text(); // Adjust as per the tag used for titles
	            String date = element.select(".event-date-class").text(); // Adjust with the actual class for dates
	            String description = element.select("p").text();

	            // Check if the title is already in the Set to avoid duplicates
	            if (!eventTitles.contains(title)) {
	                // Add the title to the Set
	                eventTitles.add(title);

	                // Create an Event object and add it to the list
	                Event event = new Event(title, date, description);
	                events.add(event);
	            }
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return events;
	}

    
//    public List<Event> scrapeUpcomingEvents_Datus() {
//        List<Event> events = new ArrayList<>();
//        try {
//            Document document = Jsoup.connect(URL).get();
//
//            // Use elementor-element class to find the events section
//            Elements eventElements = document.getElementsByClass("mec-event-month");
//            
//            for (Element element : eventElements) {
//                // Extract information for each event
//            	
//                String title = element.select("span").text(); // Adjust as per the tag used for titles
//                String date = element.select(".event-date-class").text(); // Adjust with the actual class for dates
//                String description = element.select("p").text();
//
//                // Create an Event object and add it to the list
//                Event event = new Event(title, date, description);
//                events.add(event);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return events;
//    }
}
