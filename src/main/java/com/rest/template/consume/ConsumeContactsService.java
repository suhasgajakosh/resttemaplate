package com.rest.template.consume;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rest.template.entity.Contact;

@Service
public class ConsumeContactsService {

	
	
	public ConsumeContactsService() {
		super();
	}

	public void consumeGetOneContact(long contactId) {
		
		RestTemplate restTemplate = new RestTemplate();
	
		String url = "http://localhost:8080/contact/one?id=" + contactId;
		Contact contact = (Contact) restTemplate.getForObject(url, Contact.class);
		System.out.println(contact.toString());
		
	}
}
