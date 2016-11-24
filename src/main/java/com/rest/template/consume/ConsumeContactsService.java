package com.rest.template.consume;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rest.template.entity.Contact;

@Service
public class ConsumeContactsService {

	private static Logger LOG = Logger.getLogger(ConsumeContactsService.class);

	public ConsumeContactsService() {
		super();
	}

	public void consumeGetOneContact(long contactId) {
		LOG.info("Started execution of consumeGetOneContact");
		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:8080/contact/one?id=" + contactId;
		Contact contacts = restTemplate.getForObject(url, Contact.class);
		LOG.info(contacts.toString());
		LOG.info("Completed execution of consumeGetOneContact");
	}
}
