package com.example.SpringDatabaseProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDatabaseProject.dao.StudentDao;
import com.example.SpringDatabaseProject.entity.Student;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api")
public class StudentRestController 
{
	StudentDao sd;
	@Autowired
	public StudentRestController(StudentDao sd) {
		super();
		this.sd = sd;
	}
	@GetMapping("/student")
	public List<Student> studentDisplay()
	{
		return sd.studentDisplay();
	}
	
	@GetMapping(value="/onestudent/{id}")
	public Student getOneStudent(@PathVariable int id) 
	{
		return sd.getOneStudent(id);
	}
	
	
	@Transactional
	@GetMapping(value="/delstudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		sd.deleteStudent(id);
	}
}