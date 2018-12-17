import java.time.chrono.ThaiBuddhistDate;
import java.util.Scanner;

import org.junit.experimental.theories.Theories;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class grading {
	public Student student;
	
	static String[]  answer = {"b","a","d"};
	static String[]  Stu_Answer1 = new String[3];
	
	public static int grade = 0;
	   
    public static int getGrade() {
		return grade;
	}
	 
    public String[] getStu_Answer() {
		return this.Stu_Answer1;
	}
    public static void main(String[] args) {
    	String [] Stu_Answer = getanswer();
    	GetGrade(Stu_Answer);
	}



	public static String[] getanswer() {
		Scanner console = new Scanner(System.in);
		StdOut.println("Please input the first question answer");
		String first = console.nextLine();
		Stu_Answer1[0] = first;
		StdOut.println("Please input the Second question answer");
	    String Second =console.nextLine();
	    Stu_Answer1[1] = Second;	
	    StdOut.println("Please input the first question answer");
	    String Third = console.nextLine();
	    Stu_Answer1[2] = Third;
		
	    return Stu_Answer1;
		
	}
   

	public static int GetGrade(String[] Stu_Answer) {
	    Scanner console = new Scanner(System.in);
		
       
	   for(int i=0; i<answer.length; i++) {
		   if(Stu_Answer[i].equals(answer[i])) {
			   grade+=1;
		   } 	
    }
	   //StdOut.println("the grade is: "+grade);
	   return grade;
    
    
}
}
