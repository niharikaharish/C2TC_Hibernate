package com.tns.jpacrud.dao;
import com.tns.jpacrud.entities.Student;
public interface StudentDao {
	public abstract StudentDao getStudentById(int id);
	public abstract void addStudent(StudentDao student);
	public abstract void removeStudent(StudentDao student);
	public abstract void updateStudent(StudentDao student);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}