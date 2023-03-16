package com.servlet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.servlet.dto.Student;

public class student_dao 
{
	public static void saveStudent(Student s) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manisha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
	}
	
	public  Student getStudent(String email, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manisha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query q = entityManager.createQuery("select s from Student s where email = ?1 and password = ?2",Student.class);
		q.setParameter(1, email);
		q.setParameter(2, password);
		List<Student> listofStudent = q.getResultList();
		if (listofStudent.size() == 1) {
			return (Student) listofStudent.get(0);
		}
		return null;

	}


}