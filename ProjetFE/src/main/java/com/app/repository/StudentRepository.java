package com.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.modle.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> , JpaRepository<Student,Integer> {

	public Student  findByEmail(String email);
	public Student  findByEmailAndMotdepasse(String email,String motdepasse);
	
}