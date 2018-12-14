import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Exam_UI extends ExamFrame_UI {
	//public Question question;
	//String string = question.getQuestion();
	//String q = question.getQuestion();
	private Scanner inFile1;
	private JTextField textField;
	

	public Exam_UI() {
		super("Taking Exam", 700, 1000);
		getContentPane().setLayout(null);
		JFileChooser fChooser = new JFileChooser();
		JPanel p = new JPanel();
		JTextArea tp = new JTextArea();
		

		JLabel lblTakingExam = new JLabel("Taking Exam");
		lblTakingExam.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTakingExam.setBounds(256, 23, 148, 30);
		getContentPane().add(lblTakingExam);
		
		
		
		String str = "";
		File file = new File("C:/Users/June/Desktop/Documents/test.txt");

		try {
			inFile1 = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (inFile1.hasNextLine()) {
			str += inFile1.nextLine() + System.lineSeparator();

		}
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textPane.setText(str+"\n");
		textPane.setBounds(53, 109, 531, 651);
		getContentPane().add(textPane);
		

//		
//		textField = new JTextField();
//		textField.setText(str+"\n");
//		textField.setBounds(79, 95, 504, 619);
//		getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setBounds(167, 219, 56, 16);
//		getContentPane().add(lblNewLabel);
//		JPanel content = new JPanel(new FlowLayout());
//		content.setToolTipText(toString()); 
//		setVisible(true);


	
	}
}
