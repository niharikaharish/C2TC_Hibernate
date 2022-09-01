package com.tns.jpacrud.dao;

import javax.persistence.EntityManager;

import com.tns.jpacrud.entities.Student;

public class StudentDaoImpl implements StudentDao{
         EntityManager entityManager;
	
	public StudentDaoImpl()
	{
	entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public StudentDao getStudentById(int id) {
		Student student=entityManager.find(Student.class, id);
		return student;		
	}

	@Override
	public void addStudent(StudentDao student) {
		entityManager.persist(student);	
	}

	@Override
	public void removeStudent(StudentDao student) {
		entityManager.remove(student);
		
	}

	@Override
	public void updateStudent(StudentDao student) {
		entityManager.merge(student);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
}