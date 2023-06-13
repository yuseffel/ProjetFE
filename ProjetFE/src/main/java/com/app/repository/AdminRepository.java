package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.modle.Admin;


@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer>  , JpaRepository<Admin,Integer>  {
	
	public Admin  findByEmail(String email);
	public Admin  findByEmailAndMotdepasse(String email,String motdepasse);

}
