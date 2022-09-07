package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

@RestController
public class ContactResource
{

	
	
	
	
	@Autowired
	private ContactService contactService;
	
	
	@GetMapping("/getAllContacts")
	public ResponseEntity<List<Contact>> getAllContactDetails()
	{
		List<Contact> allContacts = contactService.getAllContacts();
		
		return new ResponseEntity<List<Contact>>(allContacts,HttpStatus.OK);
	}
	
	
	@PostMapping("/addContact")
	public ResponseEntity<Contact> addContactDetails(@RequestBody Contact contact)
	{
		Contact upsert = contactService.upsert(contact);
		return new ResponseEntity<Contact>(upsert,HttpStatus.CREATED);
	}
	
	@GetMapping("/getContactById/{id}")
	public ResponseEntity<Contact> getContactUsingId(@PathVariable("id") int id)
	{
		Contact contactById = contactService.getContactById(id);
		return new ResponseEntity<Contact>(contactById,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") int id)
	{
		String deleteContactById = contactService.deleteContactById(id);
		return new ResponseEntity<String>(deleteContactById,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
}
