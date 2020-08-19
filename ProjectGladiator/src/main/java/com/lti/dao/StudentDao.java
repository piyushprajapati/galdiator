package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.Student;
import com.lti.interfaces.StudentInterface;

@Component("student")
public class StudenDao implements StudentInterface {

	@PersistenceContext		//	@Autowired	does not work for EntityManager
	private EntityManager entityManager;

	@Transactional
	public void addNewStudent(Student student) {
		System.out.println("Connection successful");
		entityManager.persist(student);

	}

	public List<Student> getAllStudents() {
		System.out.println("Connection successful");
		String jpql = "select student from Student as student";
//		String jpql = "select * from CarPart";
		Query q = entityManager.createQuery(jpql);
		List<Student> list = q.getResultList();
		
	
		return list;

	}
	
}
