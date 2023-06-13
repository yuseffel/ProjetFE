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

import com.app.modle.Student;
import com.app.repository.StudentRepository;
import com.app.service.StudentService;


@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")

public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/registrer")
	public Student registerStudent(@RequestBody Student student) throws Exception {
		String tempEmail = student.getEmail();
		if(tempEmail != null && !"".equals(tempEmail)){
			Student studentobj = studentService.fetchStudentByEmail(tempEmail);
			if(studentobj != null) {
				throw new Exception("student with " +tempEmail+ "is already exist");
			}
		};
		return studentService.registerStudent(student);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		return studentService.getStudents();		
	}
	
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestParam Integer id) {
		studentService.deleteStudent(id);
	}
	
	@PutMapping("/updateStudents")
	public Student updateStudent(@RequestBody Student student) {
		return  studentService.updateStudent(student);
	}


	
	@Autowired
	private StudentRepository studentRepository;
	@PostMapping("/login")
	public ResponseEntity<?> loginStudent(@RequestBody Student studentdata){
		System.out.println(studentdata);
		Student student = studentRepository.findByEmail(studentdata.getEmail());
		if(student.getMotdepasse().equals(studentdata.getMotdepasse())) 
			return ResponseEntity.ok(student);
			
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}
	
	/*@GetMapping("/mpoublier")
	public  String findStudentByEmail(@PathVariable String email,@PathVariable String motdepasse, HttpServletRequest request) {
		Optional<Student> student =studentService.fetchStudentByEmail(email);
	String appUrl = request.getScheme()	+ "//" + request.getServerName();
	if(!student.isPresent()) {
		System.out.println("N'est pas enregistrer");
	}
	}

	
		public Student loginStudent(@RequestBody Student student) throws Exception {
		String tempEmail = student.getEmail();
		String tempPass = student.getMotdepasse();
		Student studentObj = null;
		if(tempEmail != null && tempPass != null ) {
		   studentObj = studentService.fetchStudentByEmailAndMotdepasse(tempEmail, tempPass);
			if(studentObj != null) {
				throw new Exception("Erreur");
			}
		}
		
		return studentObj;
		
	}*/


}
