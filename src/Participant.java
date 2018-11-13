import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
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
	static Participant window = new Participant();
	private JFrame frmParticipant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Smoker");
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.TOP);
		rdbtnNewRadioButton.setBounds(62, 170, 109, 23);
		frmParticipant.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblPartname = new JLabel("Part_name");
		lblPartname.setBounds(159, 26, 76, 13);
		frmParticipant.getContentPane().add(lblPartname);
		
		JLabel label = new JLabel("Part_name");
		label.setBounds(159, 50, 76, 13);
		frmParticipant.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Part_Date");
		lblNewLabel.setBounds(159, 76, 76, 13);
		frmParticipant.getContentPane().add(lblNewLabel);
		
		JLabel lblParttel = new JLabel("Part_Tel");
		lblParttel.setBounds(159, 99, 69, 13);
		frmParticipant.getContentPane().add(lblParttel);
		
		JLabel lblPartemail = new JLabel("Part_email");
		lblPartemail.setBounds(159, 122, 69, 13);
		frmParticipant.getContentPane().add(lblPartemail);
		
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
		btnInsetNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormA.main(new String[1]);

			}
		});
		btnInsetNewForm.setBounds(304, 228, 145, 21);
		frmParticipant.getContentPane().add(btnInsetNewForm);
		rdbtnNewRadioButton.setBounds(61, 141, 109, 23);
		frmParticipant.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel label_1 = new JLabel("Email:");
		label_1.setBounds(61, 122, 45, 13);
		frmParticipant.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Telephone:");
		label_2.setBounds(61, 99, 69, 13);
		frmParticipant.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Date Of Birth:");
		label_3.setBounds(61, 75, 86, 14);
		frmParticipant.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Surname:");
		label_4.setBounds(61, 49, 69, 14);
		frmParticipant.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Name:");
		label_5.setBounds(61, 25, 69, 14);
		frmParticipant.getContentPane().add(label_5);
		
		JLabel lblParticipantDetails = new JLabel("Participant Details");
		lblParticipantDetails.setBounds(258, 11, 109, 23);
		frmParticipant.getContentPane().add(lblParticipantDetails);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(240, 140, 89, 23);
		frmParticipant.getContentPane().add(btnModify);
		
		String[] formStrings={"Choose Form...", "Form A", "Form B", "Form C", "Form D"};
		JComboBox comboBox1 = new JComboBox(formStrings);
		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String form=(String)comboBox1.getSelectedItem();
			}
		});
		
		comboBox1.setBounds(61, 227, 132, 23);
		frmParticipant.getContentPane().add(comboBox1);
		
	
		
		

		
	
	}
}
