import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Participant {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Participant window = new Participant();
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
	public Participant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(62, 37, 109, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(62, 62, 109, 14);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setBounds(62, 87, 109, 14);
		frame.getContentPane().add(lblDateOfBirth);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Smoker");
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.TOP);
		rdbtnNewRadioButton.setBounds(62, 108, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
	}
}
