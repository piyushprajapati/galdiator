import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.StudentDao;
import com.lti.entity.Gender;
import com.lti.entity.Ministry;
import com.lti.entity.Student;

public class StudentTest {
	
	@Test
	public void addStudent() {
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
	}
	
	
	
	@Test
	public void addCentralMinistry() {
		Ministry ministry =new Ministry();
		ministry.setMinistry_username("Piyush");
		ministry.setMinistry_password("abc");
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		StudentDao dao = (StudentDao)ctx.getBean("s");
		dao.addCentralMinistry(ministry);
		
	}
	

}
