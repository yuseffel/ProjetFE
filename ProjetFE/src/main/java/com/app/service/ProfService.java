package com.app.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.modle.Prof;
import com.app.repository.ProfRepository;

@Service
public class ProfService {
	
	@Autowired
	private ProfRepository profRepository;
	
	public Prof registerProf( Prof prof) {
		return profRepository.save(prof);
	}
	
	public List< Prof> getProf(){
		return (List< Prof>) profRepository.findAll();		 
	}
	
	public void deleteProf(Integer id) {
		profRepository.deleteById(id);
	}
	
	public  Prof updateProf( Prof prof) {
		Integer mat = prof.getMat();
		Prof prf = profRepository.findById(mat).get();
		prf.setNom(prof.getNom());
		prf.setPrenom(prof.getPrenom());
		prf.setEmail(prof.getEmail());
		prf.setMotdepasse(prof.getMotdepasse());
		return profRepository.save(prf);
	}
	public Prof fetchProfByEmail (String email) {
		return profRepository.findByEmail(email);
		
	}

	public Prof fetchProfByEmailAndMotdepasse (String email ,String motdepasse) {
		return profRepository.findByEmailAndMotdepasse(email, motdepasse);
		
	}
	
	
	
	
	
	

}
