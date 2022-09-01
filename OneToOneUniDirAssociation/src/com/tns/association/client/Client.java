package com.tns.association.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.assocoation.enities.Address;
import com.tns.assocoation.enities.Student;

public class Client {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Niharika");

Address homeAddress = new Address();
		
		homeAddress.setStreet("Hoskerehalli");
		homeAddress.setCity("Banaglore");
		homeAddress.setState("Karnataka");
		homeAddress.setZipCode(560085);
		
		student.setAddress(homeAddress);
		
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		
	}
}

