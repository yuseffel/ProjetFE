package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.modle.Prof;

@Repository
public interface ProfRepository extends CrudRepository<Prof, Integer>  , JpaRepository<Prof,Integer> {

	public Prof  findByEmail(String email);
	public Prof  findByEmailAndMotdepasse(String email,String motdepasse);
	
}
