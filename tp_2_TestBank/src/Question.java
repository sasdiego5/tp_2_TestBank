import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Question {
	private Scanner inFile1; 

    
    public String getQuestion(){
    	String str= "";   	  
    	File file = new File("C:/Users/June/Desktop/Documents/test.txt");
    
		try {
			inFile1 = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        while(inFile1.hasNextLine()) {
        	   str += inFile1.nextLine()+System.lineSeparator();
        	   
  
        }
  
        
        return str;
        
    	
    }


	public boolean grade()
	{
		// TODO Auto-generated method stub
		return false;
	}


    }