public class Professor {
	private char ProID;
	private String ProName;
	private String Class_ID;

	Professor(char P_ID, String P_Name, String C_name) {

		this.ProID = P_ID;
		this.ProName = P_Name;
		this.Class_ID = C_name;

	}

	public void setProID(char P_ID) {
		ProID = P_ID;
	}

	public void setProName(String P_Name) {
		ProName = P_Name;
	}

	public void setClass_ID(String C_name) {
		Class_ID = C_name;
	}

	public char getProId() {
		return ProID;
	}

	public String getProName() {
		return ProName;
	}

	public String getClass_ID() {
		return Class_ID;
	}

}
