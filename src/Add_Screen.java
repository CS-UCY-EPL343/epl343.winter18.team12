import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Add_Screen {

	private JFrame frmAddNewParticipant;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Screen window = new Add_Screen();
					window.frmAddNewParticipant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddNewParticipant = new JFrame();
		frmAddNewParticipant.setTitle("Add new Participant");
		frmAddNewParticipant.setBounds(100, 100, 450, 300);
		frmAddNewParticipant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddNewParticipant.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Name:");
		label.setBounds(19, 10, 69, 14);
		frmAddNewParticipant.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Surname:");
		label_1.setBounds(19, 34, 69, 14);
		frmAddNewParticipant.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Date Of Birth:");
		label_2.setBounds(19, 60, 86, 14);
		frmAddNewParticipant.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Telephone:");
		label_3.setBounds(19, 84, 69, 13);
		frmAddNewParticipant.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Email:");
		label_4.setBounds(19, 107, 45, 13);
		frmAddNewParticipant.getContentPane().add(label_4);
		
		JRadioButton radioButton = new JRadioButton("Smoker");
		radioButton.setVerticalAlignment(SwingConstants.TOP);
		radioButton.setBounds(19, 143, 109, 23);
		frmAddNewParticipant.getContentPane().add(radioButton);
		
		textField = new JTextField();
		textField.setBounds(110, 8, 145, 19);
		frmAddNewParticipant.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 32, 145, 19);
		frmAddNewParticipant.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 58, 145, 19);
		frmAddNewParticipant.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 81, 145, 19);
		frmAddNewParticipant.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(110, 104, 145, 19);
		frmAddNewParticipant.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnInsertParticipant = new JButton("Insert");
		btnInsertParticipant.setBounds(174, 185, 81, 21);
		frmAddNewParticipant.getContentPane().add(btnInsertParticipant);
	}
}
