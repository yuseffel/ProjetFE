package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.modle.Contact;
import com.app.service.ContactService;


@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")

public class ContactController {
	
	@Autowired
	private ContactService contactService;

	
	@PostMapping("/registerContact")
	public Contact registerContact(@RequestBody Contact contact) {
		return contactService.registerContact(contact);
	}
	
	@GetMapping("/getContact")
	public List<Contact> getContact(){
		return contactService.getContact();		
	}
	
	@DeleteMapping("/deleteContact")
	public void deleteContact(@RequestParam Integer id) {
		contactService.deleteContact(id);
	}
	


	
	


}