package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService 
{

	
	
	
	
	
	
	
	
	public Contact upsert(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(int Id);
	
	public String deleteContactById(int Id);
	
	
}
