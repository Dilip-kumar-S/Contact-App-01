package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	
	
	
	@Autowired
	private ContactRepository contactRepo;
	
	
	@Override
	public Contact upsert(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepo.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return contactRepo.findAll();
	}

	@Override
	public Contact getContactById(int Id) {
		// TODO Auto-generated method stub
		return contactRepo.findById(Id).get();
	}

	@Override
	public String deleteContactById(int Id) {
		// TODO Auto-generated method stub
		contactRepo.deleteById(Id);
		return "Deleted";
	}

}
