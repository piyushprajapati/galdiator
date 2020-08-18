import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.StudenDao;
import com.lti.entity.Student;
import com.lti.enums.Gender;

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
		
		StudenDao dao = new StudenDao();
		dao.addNewStudent(student);
	}
	
}
