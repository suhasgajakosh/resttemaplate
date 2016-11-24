package com.rest.template.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
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

	@RequestMapping(value = "/contact/one", method = RequestMethod.GET)
	@ResponseBody
	public Contact getContacts(@RequestParam(value = "id") Long contactId) {

		String linkRel = "self";
		Link link = null;

		link = new Link("http://localhost:8080/contact/one?id=" + contactId, linkRel);
		Contact contact = contactRepository.findOne(contactId);
		contact.add(link);

		contact.add(link);

		return contact;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteContact(@RequestParam(value = "id") Long contactId) {
		contactRepository.delete(contactId);
	}

	@RequestMapping(value = "/contact", method = RequestMethod.PUT)
	@ResponseBody
	public void updateContact(@RequestBody Contact contact) {
		contactRepository.save(contact);
	}

}
