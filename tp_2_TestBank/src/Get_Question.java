import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class Get_Question {
	//private File inFile1; 
//
//    public static void main(String[] args) throws IOException {
//    
//   
//   String fileName = "C:/Users/June/Desktop/Documents/test.txt";
////    Scanner inFile1 = new Scanner(file);
////    
////    while(inFile1.hasNextLine()) {
////    System.out.println(inFile1.nextLine());
////    }
//   
//
//
// 

// }
    
    public String getQuestion() throws FileNotFoundException {
    	String str= "";   	  
    	File file = new File("C:/Users/June/Desktop/Documents/test.txt");
        Scanner inFile1 = new Scanner(file);
        
        while(inFile1.hasNextLine()) {
        	   str += inFile1.nextLine();
  
        }
        
        return str;
        
    	
    }
}
