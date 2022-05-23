package com.example.Team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TeamApplication {
  
	
	public static void main(String[] args) {
		SpringApplication.run(TeamApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		   // Do any additional configuration here
//		   return builder.build();
//		}
}
