import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

public class Take_Exam extends ExamFrame{
	public Get_Question question;
	//String string= question.getQuestion();
	
	
	public Take_Exam() {
		super("Taking Exam", 700, 1000);
		getContentPane().setLayout(null);
		
		JLabel lblTakingExam = new JLabel("Taking Exam");
		lblTakingExam.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTakingExam.setBounds(256, 23, 148, 30);
		getContentPane().add(lblTakingExam);
		
       
	}
	private JPanel examPanel() {
		JPanel examPanel = new JPanel();
		return null;
		
		
	}
}
