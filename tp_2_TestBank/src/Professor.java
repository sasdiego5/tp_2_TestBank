


public class Professor
{
	private char ProID;
	private String ProName;
	private String Class_name;
	

    Professor(char P_ID, String P_Name,String C_name)
	{
    	
    	this.ProID = P_ID;
    	this.ProName = P_Name;
    	this.Class_name = C_name;
    	
	}
	
	public void setProID(char P_ID) {
		ProID = P_ID;
	}
	public void setProName(String P_Name) {
	     ProName = P_Name;
	}
	public void setClass_name(String C_name) {
		Class_name = C_name;
	}
	
	
	public char getProId() {
		return ProID;
	}
	
	public String P_Name() {
		return ProName;
	}
	public String getClass_name() {
		return Class_name;
	}
	

}
