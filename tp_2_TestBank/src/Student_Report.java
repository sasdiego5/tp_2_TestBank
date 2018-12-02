
public class Student_Report
{
	public Professor professor;
	public Student student;
	public Grade_Test grade;
	public Test_Generator test;
	

	public Student_Report(int studentID) 
	{
		if (this.student.getStuId() == studentID)
			getStudent();
	}
	
	public Student getStudent() 
	{
		return this.student;
	}
	
	public String toString() 
	{
		String report = "===== Test Results =====" ;
		report += this.student.toString();
		report += "===============================";
		
		return report;
	}
	public static void main(String[] args)
	{

	}
	
	

}
