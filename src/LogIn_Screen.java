import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPasswordField;
import java.awt.Font;
//LOGIN,PARTICIPANTS,RESULT,FORMA

public class LogIn_Screen {
	static int state=0;
	static LogIn_Screen window = new LogIn_Screen();
	public JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	private static boolean admin=false;
	private static String admin_pass="Admin";
	private static String user_pass="User";
	private static String admin_username="Admin";
	private static String user_username="User";

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public LogIn_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static boolean is_admin(){
		return admin;
	}
	private void initialize() {
//		char pass[]=new char[5];
//		pass[0]='A';
//		pass[1]='D';
//		pass[2]='M';
//		pass[3]='I';
//		pass[4]='N';
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 543, 403);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(137, 73, 75, 13);
		frmLogin.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(222, 69, 113, 19);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(137, 109, 75, 13);
		frmLogin.getContentPane().add(lblPassword);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(admin_username)&&passwordField.getText().equals(admin_pass)) {
					admin=true;
					Home_Screen.main(null);
					window.frmLogin.hide();
					initialize();
					window.frmLogin.hide();
				}else if (textField.getText().equals(user_username)&&passwordField.getText().equals(user_pass)){	
					Home_Screen.main(null);
					window.frmLogin.hide();
					initialize();
					window.frmLogin.hide();
				}else {
					JOptionPane.showMessageDialog(null, "Wrong Credentials");
				}
			}
		});
		btnLogIn.setBounds(137, 147, 88, 21);
		frmLogin.getContentPane().add(btnLogIn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(222, 105, 113, 19);
		frmLogin.getContentPane().add(passwordField);
		
		JLabel lblSmokefreebrain = new JLabel("SMOKEFREEBRAIN");
		lblSmokefreebrain.setFont(new Font("Tahoma", Font.BOLD, 46));
		lblSmokefreebrain.setBounds(45, 206, 482, 125);
		frmLogin.getContentPane().add(lblSmokefreebrain);
	}
}
