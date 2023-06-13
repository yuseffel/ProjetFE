package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.modle.Admin;
import com.app.repository.AdminRepository;



@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class AdminController {
	
	
	@Autowired
	private AdminRepository adminRepository;
	@PostMapping("/logina")
	public ResponseEntity<?> loginStudent(@RequestBody Admin admindata){
		System.out.println(admindata);
		Admin admin = adminRepository.findByEmail(admindata.getEmail());
		if(admin.getMotdepasse().equals(admindata.getMotdepasse())) 
			return ResponseEntity.ok(admin);
			
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}
	

}
