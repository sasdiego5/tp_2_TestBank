import javax.swing.JTextField;

import edu.princeton.cs.introcs.StdOut;

public class Student
{
	private int StuID;
	private String StuName;
	private int StuGrade;
	private String Class_ID;
	private JTextField StuNametxt;
	private JTextField StuIDtxt;
	private JTextField Class_IDtxt;
	

	public Student(char StdId, String SName, int StdGrade, String C_name, String P_name)
	{
		this.StuGrade = StdGrade;
		this.StuID = StdId;
		this.StuName = SName;
		this.Class_ID = C_name;

	}

	public Student(int stuID, String stuName, String classID)
	{
		this.StuID = stuID;
		this.StuName = stuName;
		this.Class_ID = classID;
	}
	
	public Student(JTextField txtUserID, JTextField txtUserName, JTextField txtClassID)
	{
		this.StuIDtxt = txtUserID;
		this.StuNametxt = txtUserName;
		this.Class_IDtxt = txtClassID;	}

	public int getStuID()
	{
		return StuID;
	}

	public void setStuID(int stuID)
	{
		StuID = stuID;
	}

	public String getStuName()
	{
		return StuName;
	}

	public void setStuName(String stuName)
	{
		StuName = stuName;
	}

	public int getStuGrade()
	{
		return StuGrade;
	}

	public void setStuGrade(int stuGrade)
	{
		StuGrade = stuGrade;
	}

	public String getClass_ID()
	{
		return Class_ID;
	}
	
	public void setClass_ID(String classID) 
	{
		this.Class_ID = classID;
	}

	public String toString()
	{
		String report = "ID: " + this.StuID + "\n";
		report += "Name: " + this.StuName + "\n";
		report += "Class: " + this.Class_ID + "\n";
		report += "Grade: " + this.StuGrade + "\n";
		return report;
	}
	
public static void main(String[] args)
{
	Student student1 = new Student( 01,"02","03");
	StdOut.println(student1.toString());


}

}
