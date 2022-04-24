package com.tns.dao;

import javax.persistence.EntityManager;
import com.tns.entities.Student;
import com.tns.entities.Student;
public class StudentDaoImpl {
	private EntityManager entityManager;
	public StudentDaoImpl() {
	entityManager = JPAUtil.getEntityManager();
	}

	public Student getStudentById(int id) {
	Student student = entityManager.find(Student.class, id);
	return student;
	}
	
	public void addStudent(Student student) {
	entityManager.persist(student);
	}
	
	public void removeStudent(Student student) {
	entityManager.remove(student);
	}
	
	
	public void updateStudent(Student student) {
	entityManager.merge(student);
	}
	
	
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	
	
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}
	}

		

