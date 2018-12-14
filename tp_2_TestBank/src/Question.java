import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question
{
	private String questions;
	private String singleQuestion;
	private Scanner inFile1;

	public String getQuestion()
	{
		this.questions = "";
		File file = new File("test.txt");

		try
		{
			inFile1 = new Scanner(file);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (inFile1.hasNextLine())
		{
			this.questions += inFile1.nextLine() + System.lineSeparator();

		}

		return this.questions;

	}

	public String oneQuestion()
	{
		this.singleQuestion = "";
		File file = new File("test.txt");

		try
		{
			inFile1 = new Scanner(file);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (inFile1.hasNextLine())
		{
			this.singleQuestion += inFile1.nextLine() + System.lineSeparator();

		}

		return this.singleQuestion;
	}

	public boolean grade()
	{
		// TODO Auto-generated method stub
		return false;
	}

	public void printQuestions()
	{
		StdOut.println(getQuestion());
	}

	public static void main(String[] args)
	{
		Question question = new Question();
		String str = question.getQuestion();
		StdOut.println(str);
		question.printQuestions();

	}

}

//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Question {
//	private Scanner inFile1;
//
//	public String getQuestion() {
//		String str = "";
//		File file = new File("C:/Users/June/Desktop/Documents/test.txt");
//
//		try {
//			inFile1 = new Scanner(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		while (inFile1.hasNextLine()) {
//			str += inFile1.nextLine() + System.lineSeparator();
//
//		}
//
//		return str;
//
//	}
//
//}