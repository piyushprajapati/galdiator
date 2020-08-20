package com.lti.entity;

import java.util.List;

public interface StudentInterface {
	public void addNewStudent(Student student);
	public List<Student> getAllStudents();
	public void addCentralMinistry(Ministry ministry);
}
