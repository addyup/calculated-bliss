package com.mandeer.websc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class OpenAIService {

    @Value("${openai.api.key}")
    private String openAiApiKey;

    private static final String OPENAI_API_URL = "https://api.openai.com/v1/completions";

    public Mono<String> generateText(String prompt) {
        WebClient client = WebClient.builder()
            .baseUrl(OPENAI_API_URL)
            .defaultHeader("Authorization", "Bearer " + openAiApiKey)
            .build();

        return client.post()
            .bodyValue(buildRequestBody(prompt))
            .retrieve()
            .bodyToMono(String.class);
    }

    private String buildRequestBody(String prompt) {
        return "{"
            + "\"model\": \"text-davinci-003\","
            + "\"prompt\": \"" + prompt + "\","
            + "\"max_tokens\": 50"
            + "}";
    }
}