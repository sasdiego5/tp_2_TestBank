import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Login_UI extends ExamFrame_UI{
	private JTextField txtUserName;
	private JTextField txtUserID;
	private JTextField txtClassID;
	Map<String, String> student_record = new HashMap<String, String>();
 	
	public Login_UI() {
		super("taking Exam", 400, 500);
		
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(153, 28, 116, 34);
		getContentPane().add(lblLogin);
		
		JLabel txtStudentName = new JLabel("Name");
		txtStudentName.setBounds(38, 85, 56, 16);
		getContentPane().add(txtStudentName);
		String name = txtStudentName.getText();
		
		
		txtUserName = new JTextField();
		txtUserName.setBounds(139, 82, 116, 22);
		getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel txtStudentID = new JLabel("ID");
		txtStudentID.setBounds(38, 138, 56, 16);
		getContentPane().add(txtStudentID);
		
		
		txtUserID = new JTextField();
		txtUserID.setBounds(139, 135, 116, 22);
		getContentPane().add(txtUserID);
		txtUserID.setColumns(10);
		String id = txtStudentID.getText();
		
		student_record.put(id, name);
		
		JLabel txtClass_ID = new JLabel("Class_ID");
		txtClass_ID.setBounds(38, 195, 56, 16);
		getContentPane().add(txtClass_ID);
		
		txtClassID = new JTextField();
		txtClassID.setBounds(139, 192, 116, 22);
		getContentPane().add(txtClassID);
		txtClassID.setColumns(10);
		
		JButton btnOK = new JButton("Login");
		btnOK.addActionListener(e->{
			System.out.println("Success!");
			
			Exam_UI tkExam_Taking = new Exam_UI();
			tkExam_Taking.setVisible(true);
			this.setVisible(false);
			
		});
		btnOK.setBounds(29, 324, 97, 25);
		getContentPane().add(btnOK);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(e->{
			System.out.println("Failure! Please try again");
			JLabel label = new JLabel("Please try again");
			JOptionPane.showMessageDialog(null, label, "Login failed", JOptionPane.ERROR_MESSAGE);
			
		});
		btnCancel.setBounds(219, 324, 97, 25);
		getContentPane().add(btnCancel);
	}
	public Map<String, String> getrecord(){
		return student_record;
	}
}
