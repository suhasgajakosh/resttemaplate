package com.rest.template.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact", schema="contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name")
	private String first_name;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	@Column(name="last_name")
	private String last_name;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="email_address")
	private String email_address;
	
	protected Contact() {}

	public Contact(long id, String first_name, String last_name, String phone_number, String email_address) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.email_address = email_address;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", phone_number="
				+ phone_number + ", email_address=" + email_address + "]";
	}

}
