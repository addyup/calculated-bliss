package com.mandeer.websc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandeer.websc.model.Event;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class MandeerController {

    @Autowired
    private MandeerScraperService scraperService;

    @GetMapping("/upcoming")
    public List<Event> getUpcomingEvents() {
        return scraperService.scrapeUpcomingEvents();
    }
}
