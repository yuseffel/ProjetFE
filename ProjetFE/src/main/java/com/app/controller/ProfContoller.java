package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.modle.Prof;
import com.app.repository.ProfRepository;
import com.app.service.ProfService;





@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")

public class ProfContoller {
	@Autowired
	private ProfService profService;

	@PostMapping("/registrerProf")
	public Prof registerProf(@RequestBody Prof prof) {
		return profService.registerProf(prof);
	}
	
	@GetMapping("/getProf")
	public List<Prof> getProf(){
		return profService.getProf();		
	}
	
	@DeleteMapping("/deleteProf")
	public void deleteProf(@RequestParam Integer id) {
		profService.deleteProf(id);
	}
	
	@PutMapping("/updateProf")
	public Prof updateProf(@RequestBody Prof prof) {
		return  profService.updateProf(prof);
	}
	
	@Autowired
	private ProfRepository profRepository;
	@PostMapping("/loginp")
	public ResponseEntity<?> loginProf(@RequestBody Prof profdata){
		System.out.println(profdata);
		Prof prof = profRepository.findByEmail(profdata.getEmail());
		if(prof.getMotdepasse().equals(profdata.getMotdepasse())) 
			return ResponseEntity.ok(prof);
		
			
		return (ResponseEntity<?>) ResponseEntity.internalServerError();

		
	}
	
	
	

}
