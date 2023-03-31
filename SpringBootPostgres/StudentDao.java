package com.example.SpringDatabaseProject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SpringDatabaseProject.entity.Student;

import jakarta.persistence.EntityManager;


@Repository
public class StudentDao implements StudentDaoMethods
{
	EntityManager eman;
	
	@Autowired
	public StudentDao(EntityManager eman) {
		super();
		this.eman = eman;
	}
	
	@Override
	public List<Student> studentDisplay() {
		Session sess = eman.unwrap(Session.class);
		Query<Student> query = sess.createQuery("from 'Student'", Student.class);
		List<Student> lst = query.getResultList();
		return lst;
	}

	@Override
	public Student getOneStudent(int id) 
	{
		Session sess = eman.unwrap(Session.class);
		Student s = sess.get(Student.class, id);
		return s;
	}
	
	@Override
	public void deleteStudent(int id) {
		Session sess = eman.unwrap(Session.class);
		Query<Student> query = sess.createQuery("delete from 'Student' where id="+id);
		query.executeUpdate();
	}
	
	
}