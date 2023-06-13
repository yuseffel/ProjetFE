package com.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.modle.Student;
import com.app.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student registerStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getStudents(){
		return (List<Student>) studentRepository.findAll();		 
	}
	
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
	
	public Student updateStudent(Student student) {
		Integer num = student.getNum();
		Student std = studentRepository.findById(num).get();
		std.setNom(student.getNom());
		std.setPrenom(student.getPrenom());
		std.setEmail(student.getEmail());
		std.setMotdepasse(student.getMotdepasse());
		std.setCfmotpasse(student.getCfmotpasse());
		return studentRepository.save(std);
	}
	public Student fetchStudentByEmail (String email) {
		return studentRepository.findByEmail(email);
		
	}
	

	public Student fetchStudentByEmailAndMotdepasse (String email ,String motdepasse) {
		return studentRepository.findByEmailAndMotdepasse(email, motdepasse);
		
	}
 
		
}
	 
	
