package com.elephantScrape.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() 
	{
		return new WebMvcConfigurer() 
		{
			public void addCorsMapping(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200", "https://evented.netlify.app");
			}
		};
		
	}

}
