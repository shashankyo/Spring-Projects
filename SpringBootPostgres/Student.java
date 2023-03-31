package com.example.SpringDatabaseProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	int ID;

	String Branch;

	String Name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int iD, String branch, String name) {
		super();
		ID = iD;
		Branch = branch;
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
