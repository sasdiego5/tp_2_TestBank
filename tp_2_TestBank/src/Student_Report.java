import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Student_Report
{
	public Professor professor;
	public Student[] students = new Student[50];
	public Student currentStudent;
	public Grade_Test grade;
	public Test_Generator test;
	

	public Student_Report() 
	{
		
	}
	
	public Student Student_Report(int studentID) 
	{
		for (int i = 0; i < students.length; i++) 
		{	
			if (this.students[i].getStuID() == studentID)
				currentStudent = this.students[i];	
		}
		return currentStudent;
	}
	
	public void addStudent(Student currentStudent)
	{

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
