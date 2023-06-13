package com.app.modle;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity
public class Prof {
	
	@Id
	private Integer mat;
	 
    private String nom;
     
    private String prenom;
 
    private String email;
 
    private String motdepasse;
    

    

	public Integer getMat() {
		return mat;
	}

	public void setMat(Integer mat) {
		this.mat = mat;
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
	



}
