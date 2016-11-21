package com.rest.template.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.template.entity.Contact;
import com.rest.template.repository.ContactRepository;

@RestController
public class ContactConroller {

	@Autowired
	protected ContactRepository contactRepository;

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	@ResponseBody
	public void saveContact(@RequestBody Contact contact) {
		if (null != contact) {
			System.out.println(contact.toString());
			contactRepository.save(contact);
		} else {
			System.out.println("contact not received");
		}
		
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	@ResponseBody
	public List<Contact> getContacts() {
		return contactRepository.findAll();
	}

}
