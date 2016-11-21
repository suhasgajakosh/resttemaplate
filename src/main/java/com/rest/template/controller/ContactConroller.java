package com.rest.template.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		contactRepository.save(contact);
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	@ResponseBody
	public List<Contact> getContacts() {
		return contactRepository.findAll();
	}
	
	@RequestMapping(value = "/contact/{id}", method = RequestMethod.GET)
	public Contact getOneContact(@PathParam(value = "id") long contactId) {
		return contactRepository.findOne(contactId);
	}
	
	@RequestMapping(value="/contact", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteContact(@RequestParam(value = "id") long contactId ) {
		contactRepository.delete(contactId);
	}
	
	@RequestMapping(value="/contact", method = RequestMethod.PUT)
	@ResponseBody
	public void updateContact(@RequestParam(value = "id") long contactId, @RequestBody Contact contact)  {
		
	}

}
