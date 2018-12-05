import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.util.ArrayList;
import java.util.List;

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

//		StdOut.println("Please enter Student ID");
		char StuID = 01;
		
//		StdOut.println("Please enter Student Name");
		String StuName = "Student A";
		
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
		
		Take_Exam people = new Take_Exam();
		people.getrecord();
		List<String> l = new ArrayList<String>(people.getrecord().keySet());
	}
	
	

}
