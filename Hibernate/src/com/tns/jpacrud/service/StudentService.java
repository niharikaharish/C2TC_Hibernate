package com.tns.jpacrud.service;

import com.tns.jpacrud.dao.StudentDao;
import com.tns.jpacrud.entities.Student;

public interface StudentService {
	public abstract StudentDao findStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
}
