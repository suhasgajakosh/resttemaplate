package com.rest.template.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.template.entity.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {	
	
	List<Contact> findAll();	

}
