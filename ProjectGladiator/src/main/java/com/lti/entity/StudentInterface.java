package com.lti.interfaces;

import java.util.List;

import com.lti.entity.Student;

public interface StudentInterface {
	public void addNewStudent(Student student);
	public List<Student> getAllStudents();
}
