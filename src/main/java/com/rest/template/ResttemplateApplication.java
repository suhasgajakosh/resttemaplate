package com.rest.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.template.consume.ConsumeContactsService;

@SpringBootApplication
public class ResttemplateApplication {

	
	
	public static void main(String[] args) {

		SpringApplication.run(ResttemplateApplication.class, args);
		
		ConsumeContactsService consumeContactService = new ConsumeContactsService();
		consumeContactService.consumeGetOneContact(15);
		
	}
}
