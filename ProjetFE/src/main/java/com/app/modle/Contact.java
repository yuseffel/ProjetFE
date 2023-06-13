package com.app.modle;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer num;
    private String nom;
     
    private String prenom;
 
    private String email;
 
    private String message;
    public Contact() {
		
	}

	public Contact(Integer id, Integer num, String nom, String prenom, String email, String message) {
		super();
		this.id = id;
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer num) {
		this.id = num;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
    

}
