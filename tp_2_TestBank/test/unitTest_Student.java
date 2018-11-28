import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class unitTest_Student
{

	private Student student;
	private char StuID;
	private String StuName;
	private int StuGrade;
	private String Class_name;
	private String Pro_name;

	@Before
	public void setUp() throws Exception
	{
		this.student = new Student(StuID, StuName, StuGrade, Class_name, Pro_name);
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test_student_ID()
	{
		char studentID = 01;

		this.student.setStuID(studentID);

		assertEquals(this.student.getStuId(), (char) 01);
	}

	@Test
	public void test_student_name()
	{
		String studentName = "TestStudent";

		this.student.setStuName("TestStudent");

		assertEquals(this.student.getStuName(), studentName);
	}

	@Test
	public void test_student_class()
	{
		String studentClass = "TestClass";

		this.student.setClass_name("TestClass");

		assertEquals(this.student.getClass_name(), studentClass);
	}

	@Test
	public void test_student_Grade()
	{
		char studentGrade = 100;

		this.student.setStuGrade(studentGrade);

		assertEquals(this.student.getStuGrade(), (char) 100);
	}

	@Test
	public void test_student_professor_name()
	{
		String professorName = "TestProfessor";

		this.student.setPro_name(professorName);

		assertEquals(this.student.getPro_name(), "TestProfessor");
	}

}
