package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.modle.Contact;
import com.app.repository.ContactRepository;
@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	
	public Contact registerContact(Contact contact) {
		return contactRepository.save(contact);
	}
	
	public List<Contact> getContact(){
		return (List<Contact>) contactRepository.findAll();		 
	}
	
	public void deleteContact(Integer id) {
		contactRepository.deleteById(id);
	}
	
 
		
}