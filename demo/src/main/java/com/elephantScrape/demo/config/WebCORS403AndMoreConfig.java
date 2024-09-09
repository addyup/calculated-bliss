package com.elephantScrape.demo.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebCORS403AndMoreConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Allow all endpoints
                .allowedOrigins("*")  // Your Angular app URL (adjust if needed)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allow common HTTP methods
                .allowedHeaders("*")  // Allow all headers
                .exposedHeaders("Authorization")  // Expose headers like Authorization if needed
                .allowCredentials(true)  // Allow cookies and credentials if necessary
                .maxAge(3600);  // Cache preflight response for 1 hour
    }
}
