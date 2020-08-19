package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.Ministry;
import com.lti.entity.Student;
import com.lti.entity.StudentInterface;

@Component("s")
public class StudentDao implements StudentInterface {

	@PersistenceContext		//	@Autowired	does not work for EntityManager
	private EntityManager entityManager;

	@Transactional
	public void addCentralMinistry(Ministry ministry) {
		
		System.out.println("Connection successful");
		entityManager.persist(ministry);
		
	}
	
	public void addNewStudent(Student student) {
		System.out.println("Connection successful");
		entityManager.persist(student);

	}

	public List<Student> getAllStudents() {
		return null;

	}
	
}
