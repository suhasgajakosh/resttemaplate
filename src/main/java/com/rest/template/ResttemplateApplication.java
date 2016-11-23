package com.rest.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.template.consume.ConsumeContactsService;

@SpringBootApplication
public class ResttemplateApplication {

	private static ConsumeContactsService consumeContactService;

	@Autowired
	public ResttemplateApplication(ConsumeContactsService consumeContactService) {
		ResttemplateApplication.consumeContactService = consumeContactService;
	}

	public static void main(String[] args) {

		SpringApplication.run(ResttemplateApplication.class, args);

		consumeContactService.consumeGetOneContact(15);

	}
}
