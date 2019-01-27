package com.al.ikubinfo.akademia.mavenDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HelloWorld {

	public static void main(String[] args) {
		
		HelloEntity hello = new HelloEntity();
		hello.setMessage("Test");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mavenDemo");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		
		em.persist(hello);
		
		tx.commit();
		em.close();
	}
}
