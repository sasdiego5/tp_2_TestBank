import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student_Report
{
	public Professor professor;
	public Student[] students = new Student[50];
	public Student currentStudent;
	public Test grade;
	public Test_Generator test;
	public Login_UI loginfo;

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

		// StdOut.println("Please enter Student ID");
		char StuID = 01;

		// StdOut.println("Please enter Student Name");
		String StuName = "Student A";
		String classID = "635";

		currentStudent = new Student(StuID, StuName, classID);

		int stuIndex = 0;
		this.students[stuIndex] = currentStudent;
		stuIndex++;
	}

	public String toString()
	{
		String report = "===== Test Results =====";
		report += this.currentStudent.toString();
		report += "===============================";

		return report;
	}

	public void FileWriter() throws IOException
	{
		String fileContent = "Student Exam Report";
		fileContent += this.loginfo.students;

		FileWriter fileWriter = new FileWriter("Student_Report.txt");
		fileWriter.write(fileContent);
		fileWriter.close();
	}

	public static void main(String[] args) throws IOException
	{
		Student_Report StuRep = new Student_Report();
		StuRep.FileWriter();
		Login_UI people = new Login_UI();

	}

}
