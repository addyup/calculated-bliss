package com.mandeer.websc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import reactor.core.publisher.Mono;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/openai")
@CrossOrigin(origins = "http://localhost:4200")
public class OpenAIController {

    @Autowired
    private OpenAIService openAIService;

    @PostMapping("/generate")
    public Mono<String> generateText(@RequestBody String prompt) {
        return openAIService.generateText(prompt);
    }
}
