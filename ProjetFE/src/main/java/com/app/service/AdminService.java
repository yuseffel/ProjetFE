package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.modle.Admin;
import com.app.repository.AdminRepository;


@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin fetchStudentByEmail (String email) {
		return adminRepository.findByEmail(email);
		
	}
	

	public Admin fetchStudentByEmailAndMotdepasse (String email ,String motdepasse) {
		return adminRepository.findByEmailAndMotdepasse(email, motdepasse);
		
	}
	
	

	

}
