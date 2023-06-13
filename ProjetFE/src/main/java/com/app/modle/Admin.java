package com.app.modle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Admin {
	
	@Id
    private String email;
 
    private String motdepasse;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}	
	

	public Admin() {
	}

	public Admin(String email, String motdepasse) {
		this.email = email;
		this.motdepasse = motdepasse;
	}

    

	
	
    
    

}
