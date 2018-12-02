import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Student_Report
{
	public Professor professor;
	public Student[] students;
	public Student currentStudent;
	public Grade_Test grade;
	public Test_Generator test;
	

	public Student_Report() 
	{
		
	}
	
	public Student_Report(int studentID) 
	{
		for (int i = 0; i < students.length; i++) 
		{	
			if (this.students[i].getStuId() == studentID)
				currentStudent = this.students[i];	
		}
	
	}
	
	public void addStudent(Student currentStudent)
	{
		this.students = new Student[50];

		StdOut.println("Please enter Student ID");
		int StuID = StdIn.readInt();
		
		StdOut.println("Please enter Student Name");
		String StuName = StdIn.readLine();
		
		currentStudent = new Student(StuID, StuName);
				
		int stuIndex = 0;
		this.students[stuIndex] = currentStudent;
		stuIndex++;
	}
	
	public String toString() 
	{
		String report = "===== Test Results =====" ;
		report += this.currentStudent.toString();
		report += "===============================";
		
		return report;
	}
	public static void main(String[] args)
	{

	}
	
	

}
