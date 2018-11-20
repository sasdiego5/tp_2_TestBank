

public class Student
{
	private char StuID;
	private String StuName;
	private int StuGrade;
	private String Class_name;
	private String Pro_name;
	

    Student(char StdId, String SName, int StdGrade,String C_name, String P_name)
	{
    	this.StuGrade = StdGrade;
    	this.StuID = StdId;
    	this.StuName = SName;
    	this.Class_name = C_name;
    	this.Pro_name =P_name;
    	
	}
	
	public void setStuID(char StdId) {
		StuID = StdId;
	}
	public void setStuGrade(char StdGrade) {
		StuGrade = StdGrade;
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
	
	
	public char getStdId() {
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
	

}
