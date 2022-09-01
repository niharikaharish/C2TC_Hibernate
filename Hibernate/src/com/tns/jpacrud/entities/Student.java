package com.tns.jpacrud.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tns.jpacrud.dao.StudentDao;

@Entity
@Table(name="Student")
public class Student implements StudentDao {
	@Id
private int studentid;
	
	private String Studentname;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return Studentname;
	}

	public void setStudentName(String Studentname) {
		this.Studentname = Studentname;
	}

	public Student() {
	}

	public Student(int studentid, String Studentname) {
		super();
		this.studentid = studentid;
		this.Studentname = Studentname;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + Studentname + "]";
	}

	@Override
	public StudentDao getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(StudentDao student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudent(StudentDao student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentDao student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}
	
}
