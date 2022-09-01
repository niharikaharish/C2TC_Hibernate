package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args) 
	{
		StudentService studentService=new StudentServiceImpl();
		StudentService studentservice=new StudentServiceImpl();
		Student student=new Student();
		//insert operation 
		student.setStudentid(103);
		student.setStudentName("Niharika");
		studentservice.addStudent(student);
	}
}