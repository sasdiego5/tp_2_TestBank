
public class Grade_Test
{
	public Professor professor;
	public Student student;
	public boolean answer;
	public int grade;
	public Test_Generator test;
	
	public Grade_Test() 
	{
		this.grade = 0;
	}
	
	public int getGrade() 
	{
		return grade;
	}
	
	public void Grader() 
	{
		for (int i =0; i < this.test.getLength(); i++)
		if (this.answer == true)
			grade += 1;
		this.student.setStuGrade(this.grade);
	}
	
	public int NumQuestions() 
	{
		return Test_Generator.getLength();
	}
	
	public static void main(String[] args)
	{

	}

}
