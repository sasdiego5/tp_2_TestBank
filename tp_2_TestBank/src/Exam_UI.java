import javax.swing.JSeparator;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JTextArea;

public class Exam_UI extends ExamFrame_UI
{
	private Question question;
//	String str = "" + question.getQuestion();


	public Exam_UI()
	{
		super("Taking Exam", 700, 1000);
		getContentPane().setLayout(null);

		JLabel lblTakingExam = new JLabel("Taking Exam");
		lblTakingExam.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTakingExam.setBounds(256, 23, 148, 30);
		getContentPane().add(lblTakingExam);

		JLabel lblNewLabel = new JLabel("Exam: ");
		lblNewLabel.setBounds(167, 219, 56, 16);
		getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
//		textArea.setText(str);
//		String ques = textArea.getText();
//		textArea.insert(ques,0);
		textArea.setBounds(124, 251, 259, 143);
		getContentPane().add(textArea);
		question.printQuestions();

		// JPanel content = new JPanel(new FlowLayout());
		// content.setToolTipText(string);
		// setVisible(true);

	}
}