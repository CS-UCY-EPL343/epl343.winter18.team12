import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
<<<<<<< HEAD
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
=======
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
>>>>>>> branch 'master' of https://github.com/CS-UCY-EPL343/epl343.winter18.team12.git

public class Participant {

	private JFrame frmParticipant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Participant window = new Participant();
					window.frmParticipant.setVisible(true);
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
		frmParticipant = new JFrame();
		frmParticipant.setTitle("Participant");
		frmParticipant.setBounds(100, 100, 653, 445);
		frmParticipant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmParticipant.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
<<<<<<< HEAD
		lblName.setBounds(62, 37, 69, 14);
		frmParticipant.getContentPane().add(lblName);
=======
		lblName.setBounds(61, 70, 109, 14);
		frame.getContentPane().add(lblName);
>>>>>>> branch 'master' of https://github.com/CS-UCY-EPL343/epl343.winter18.team12.git
		
		JLabel lblSurname = new JLabel("Surname:");
<<<<<<< HEAD
		lblSurname.setBounds(62, 61, 69, 14);
		frmParticipant.getContentPane().add(lblSurname);
=======
		lblSurname.setBounds(61, 95, 109, 14);
		frame.getContentPane().add(lblSurname);
>>>>>>> branch 'master' of https://github.com/CS-UCY-EPL343/epl343.winter18.team12.git
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
<<<<<<< HEAD
		lblDateOfBirth.setBounds(62, 87, 86, 14);
		frmParticipant.getContentPane().add(lblDateOfBirth);
=======
		lblDateOfBirth.setBounds(61, 120, 109, 14);
		frame.getContentPane().add(lblDateOfBirth);
>>>>>>> branch 'master' of https://github.com/CS-UCY-EPL343/epl343.winter18.team12.git
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Smoker");
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.TOP);
<<<<<<< HEAD
		rdbtnNewRadioButton.setBounds(62, 170, 109, 23);
		frmParticipant.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblPartname = new JLabel("Part_name");
		lblPartname.setBounds(171, 38, 76, 13);
		frmParticipant.getContentPane().add(lblPartname);
		
		JLabel label = new JLabel("Part_name");
		label.setBounds(171, 63, 76, 13);
		frmParticipant.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Part_Date");
		lblNewLabel.setBounds(171, 88, 76, 13);
		frmParticipant.getContentPane().add(lblNewLabel);
		
		JLabel lblTelephone = new JLabel("Telephone:");
		lblTelephone.setBounds(62, 111, 69, 13);
		frmParticipant.getContentPane().add(lblTelephone);
		
		JLabel lblParttel = new JLabel("Part_Tel");
		lblParttel.setBounds(171, 111, 69, 13);
		frmParticipant.getContentPane().add(lblParttel);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(62, 134, 45, 13);
		frmParticipant.getContentPane().add(lblEmail);
		
		JLabel lblPartemail = new JLabel("Part_email");
		lblPartemail.setBounds(171, 134, 69, 13);
		frmParticipant.getContentPane().add(lblPartemail);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"------------", "hhhh"}));
		comboBox.setBounds(64, 227, 183, 23);
		frmParticipant.getContentPane().add(comboBox);
		
		JLabel lblFormsCompleted = new JLabel("Forms completed");
		lblFormsCompleted.setBounds(62, 204, 109, 13);
		frmParticipant.getContentPane().add(lblFormsCompleted);
		
		JButton btnEditForm = new JButton("Edit form");
		btnEditForm.setBounds(62, 271, 85, 21);
		frmParticipant.getContentPane().add(btnEditForm);
		
		JButton btnDeleteParticipant = new JButton("Delete Participant");
		btnDeleteParticipant.setBounds(463, 34, 145, 21);
		frmParticipant.getContentPane().add(btnDeleteParticipant);
		
		JButton btnInsetNewForm = new JButton("Insert new Form");
		btnInsetNewForm.setBounds(304, 228, 145, 21);
		frmParticipant.getContentPane().add(btnInsetNewForm);
=======
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
		
	
		
		

		
	
>>>>>>> branch 'master' of https://github.com/CS-UCY-EPL343/epl343.winter18.team12.git
	}
}
