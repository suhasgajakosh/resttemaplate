package com.rest.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.rest.template.entity.Contact;

@SpringBootApplication
public class ResttemplateApplication {

	public static void main(String[] args) {

		SpringApplication.run(ResttemplateApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		Contact contact = (Contact) restTemplate.getForObject("http://localhost:8080/contact/one?id=15", Contact.class);
		System.out.println(contact.toString());
	}
}
