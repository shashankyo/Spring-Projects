package com.example.SpringDatabaseProject.dao;

import java.util.List;

import com.example.SpringDatabaseProject.entity.Student;

public interface StudentDaoMethods {

	public List<Student> studentDisplay();
	public Student getOneStudent(int id);
	public void deleteStudent(int id);
	
}
