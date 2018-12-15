import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class grading {
	
	
	static String[]  answer = {"b","a","d"};
	static String[]  Stu_Answer = new String[3];
    public static void main(String[] args) {
    	StdOut.println("Please input the first question answer");
	    String first = StdIn.readLine(); 
	    Stu_Answer[0] = first;
		StdOut.println("Please input the Second question answer");
	    String Second = StdIn.readLine(); 
	    Stu_Answer[1] = Second;	
	    StdOut.println("Please input the first question answer");
	    String Third = StdIn.readLine(); 
	    Stu_Answer[2] = Third;
	    
	    int grade = 0;
	   for(int i=0; i<answer.length; i++) {
		   if(Stu_Answer[i].equals(answer[i])) {
			   grade+=1;
		   }
	   }
	   
	   
	   
	   StdOut.print("Your Grade is: " + grade + " out of 3");

	}
}
