public class Student
{
	private char StuID;
	private String StuName;
	private int StuGrade;
	private String Class_ID;

	public Student(char StdId, String SName, int StdGrade, String C_name, String P_name)
	{
		this.StuGrade = StdGrade;
		this.StuID = StdId;
		this.StuName = SName;
		this.Class_ID = C_name;

	}

	public Student(char stuID, String stuName, String classID)
	{
		this.StuID = stuID;
		this.StuName = stuName;
		this.Class_ID = classID;
	}

	public char getStuID()
	{
		return StuID;
	}

	public void setStuID(char stuID)
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
		String report = "ID: " + getStuID() + "\n";
		report += "Name: " + getStuName() + "\n";
		report += "Grade: " + getStuGrade() + "\n";
		return report;
	}

}
