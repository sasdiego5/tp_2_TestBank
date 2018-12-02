

public class Student
{
	private int StuID;
	private String StuName;
	private int StuGrade;
	private String Class_name;
	private String Pro_name;
	

    Student(int StdId, String SName)
	{
    	this.StuID = StdId;
    	this.StuName = SName;
    	
	}
	
	public void setStuID(char StdId) {
		StuID = StdId;
	}
	public void setStuGrade(int grade) {
		StuGrade = grade;
	}
	public void setStuName(String SName) {
		StuName = SName;
	}
	public void setClass_name(String C_name) {
		Class_name = C_name;
	}

	public void setPro_name(String P_name) {
		Pro_name = P_name;
	}
	
	public int getStuId() {
		return StuID;
	}
	public int getStuGrade() {
		return StuGrade;
	}
	public String getStuName() {
		return StuName;
	}
	public String getClass_name() {
		return Class_name;
	}
	public String getPro_name() {
		return Pro_name;
	}
	
	public String toString() 
	{
		String report = "ID: " + getStuId() + "\n";
		report += "Name: " + getStuName() + "\n";
		report += "Grade: " + getStuGrade() + "\n";
		return report;
	}

}
