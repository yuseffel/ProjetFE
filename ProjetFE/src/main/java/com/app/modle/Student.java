package com.app.modle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	
	@Id
    private Integer num;
 
    private String nom;
     
    private String prenom;
 
    private String email;
 
    private String motdepasse;

    private String cfmotpasse;


    
    
    
	public Student() {
		
	}
	
	public Student(Integer num, String nom, String prenom, String email, String motdepasse, String cfmotpasse) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motdepasse = motdepasse;
		this.cfmotpasse = cfmotpasse;
	}
	
	
   

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

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

	public String getCfmotpasse() {
		return cfmotpasse;
	}

	public void setCfmotpasse(String cfmotpasse) {
		this.cfmotpasse = cfmotpasse;
	}
	


	
    
 

}
