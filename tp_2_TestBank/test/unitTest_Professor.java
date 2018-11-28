import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class unitTest_Professor
{
	private Professor professor;
	private char ProID;
	private String ProName;
	private String Class_name;

	@Before
	public void setUp() throws Exception
	{
		this.professor = new Professor(ProID, ProName, Class_name);
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test_get_professor_name()
	{
		String professorName = "TestProfessor";

		this.professor.setProName("TestProfessor");

		assertEquals(this.professor.getProName(), professorName);
	}

	@Test
	public void test_professor_ID()
	{
		char professorID = 01;

		this.professor.setProID((char) 01);

		assertEquals(this.professor.getProId(), professorID);
	}

	@Test
	public void test_professor_class()
	{
		String professorClass = "TestClass";

		this.professor.setClass_name("TestClass");

		assertEquals(this.professor.getClass_name(), professorClass);
	}

}
