package com.lti;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Gender;
import com.lti.entity.Student;
import com.lti.entity.StudentInterface;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		StudentInterface sp=(StudentInterface)ctx.getBean("student1");
		
		Student student = new Student();
		student.setPassword("aayush");
		student.setName("aayush");
		student.setDob(LocalDate.of(1998, 11, 06));
		student.setMobile("1234567890");
		student.setEmail("aayush@lti.com");
		student.setAadhar("1234567890123456");
		student.setAcc_no("12345678901234");
		student.setIfsc_code("AXIS0002345");
		student.setBank_name("AXIS");
		student.setGender(Gender.Male);
		student.setState_domicile("Rajasthan");
		student.setDistrict("Ajmer");
		
		
		sp.addNewStudent(student);
	}
	

}
