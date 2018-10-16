import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionEvent;

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
		lblName.setBounds(61, 70, 109, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(61, 95, 109, 14);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setBounds(61, 120, 109, 14);
		frame.getContentPane().add(lblDateOfBirth);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Smoker");
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.TOP);
		rdbtnNewRadioButton.setBounds(61, 141, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblParticipantDetails = new JLabel("Participant Details");
		lblParticipantDetails.setBounds(258, 11, 109, 23);
		frame.getContentPane().add(lblParticipantDetails);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(484, 66, 89, 23);
		frame.getContentPane().add(btnModify);
		
		JLabel lblLabelcombo = new JLabel("Completed Forms");
		lblLabelcombo.setBounds(412, 208, 132, 14);
		frame.getContentPane().add(lblLabelcombo);
		
		String[] formStrings={"Choose Form...", "Form A", "Form B", "Form C", "Form D"};
		JComboBox comboBox = new JComboBox(formStrings);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String form=(String)comboBox.getSelectedItem();
			if(form.equals("Form A"))lblLabelcombo.setText("Completed Forms A");
			if(form.equals("Form B"))lblLabelcombo.setText("Completed Forms B");
			if(form.equals("Form C"))lblLabelcombo.setText("Completed Forms C");
			if(form.equals("Form D"))lblLabelcombo.setText("Completed Forms D");
			if(form.equals("Choose Form..."))lblLabelcombo.setText("Completed Forms");
			}
		});
		
		comboBox.setBounds(184, 204, 132, 23);
		frame.getContentPane().add(comboBox);
		
	
		
		

		
	
	}
}
