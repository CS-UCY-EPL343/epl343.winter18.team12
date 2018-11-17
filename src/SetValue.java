import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class SetValue {

	static public JFrame frame;
	static public JTextField textField;
	static public JTextField textField_1;
	static public JLabel label;	
	static public JRadioButton rdbtnAllForms;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetValue window = new SetValue();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SetValue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void initialize() {
	
		frame = new JFrame();
		frame.setBounds(100, 100, 669, 202);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		label.setBounds(10, 11, 633, 14);
		frame.getContentPane().add(label);
		
		JLabel lblValue = new JLabel("Value:");
		lblValue.setBounds(45, 49, 46, 14);
		frame.getContentPane().add(lblValue);
		
		SetValue.textField = new JTextField();
		textField.setBounds(140, 46, 128, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFormNumber = new JLabel("Form Number:");
		lblFormNumber.setBounds(45, 97, 85, 14);
		frame.getContentPane().add(lblFormNumber);
		
		
		textField_1.setBounds(140, 94, 46, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		//rdbtnAllForms = new JRadioButton("All Forms");
		rdbtnAllForms.setBounds(207, 93, 109, 23);
		frame.getContentPane().add(rdbtnAllForms);
		rdbtnAllForms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAllForms.isSelected()) {
					textField_1.setText("");
					textField_1.setEnabled(false);
				}else {
					textField_1.setEnabled(true);
				}
			}
			
		});
		
		JLabel lblEgFor = new JLabel("e.g. \"1\" for searching only the first form of every participant");
		lblEgFor.setBounds(45, 122, 344, 14);
		frame.getContentPane().add(lblEgFor);
		
		JButton btnSet = new JButton("SET");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Search_Screen.objAttributesToSearch.add(new obj_Attribute(label.getText(), Form_type f,String t, int v, boolean a, int d))
			}
		});
		btnSet.setBounds(386, 118, 89, 23);
		frame.getContentPane().add(btnSet);
	}
}
