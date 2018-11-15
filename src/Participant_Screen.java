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
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;

public class Participant_Screen {
	static Participant_Screen window = new Participant_Screen();
	static JLabel label_4;
	private JFrame frmParticipant;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtDate;
	private JTextField txtTelephoneno;
	private JTextField txtExampeexamplecom;
	private JTextField txtId;
	
	public static Participant part;

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
	 * @wbp.parser.entryPoint
	 */
	public Participant_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmParticipant = new JFrame();
		frmParticipant.setTitle("Participant");
		frmParticipant.setBounds(100, 100, 652, 474);
		frmParticipant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmParticipant.getContentPane().setLayout(null);
		JList list = new JList();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Smoker");
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.TOP);
		rdbtnNewRadioButton.setBounds(62, 161, 109, 23);
		frmParticipant.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnEditForm = new JButton("Edit form");
		//System.out.println("PartState:"+LogInScreen.state);
		if(part==null)btnEditForm.setEnabled(false);
		btnEditForm.setBounds(61, 370, 85, 21);
		frmParticipant.getContentPane().add(btnEditForm);
		
		JButton btnDeleteParticipant = new JButton("Delete Participant");
		if(part==null)btnDeleteParticipant.setEnabled(false);
		btnDeleteParticipant.setBounds(459, 228, 145, 21);
		frmParticipant.getContentPane().add(btnDeleteParticipant);
		
		JButton btnInsetNewForm = new JButton("Insert new Form");
		if(part==null)btnInsetNewForm.setEnabled(false);
		btnInsetNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormA_Screen.main(new String[1]);
				FormA_Screen.fo=null;
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
		
		label_4 = new JLabel("Surname:");
		label_4.setBounds(304, 50, 69, 14);
		frmParticipant.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Name:");
		label_5.setBounds(61, 50, 69, 14);
		frmParticipant.getContentPane().add(label_5);
		
		JScrollPane scrollPane = new JScrollPane();
		if(part==null)scrollPane.setEnabled(false);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(39, 266, 178, 93);
		frmParticipant.getContentPane().add(scrollPane);
		
		if(part==null)list.setEnabled(false);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		String[] formStrings={"Choose Form...", "Form1"};
		JComboBox comboBox1 = new JComboBox(formStrings);
		if(part==null)comboBox1.setEnabled(false);
		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String form=(String)comboBox1.getSelectedItem();
			String stringArray[]=new String[6];
			switch(form) {
			case "Form1": 
				int count=0;
				for(int i=0;i<part.part_forms.size();i++) {
					if(part.part_forms.get(i).type==Form_type.Form1){
						stringArray[count]="Form1-"+part.part_forms.get(i).ID;
						count++;
					}
				}
				list.setListData(stringArray);
				break;
			}
			}
		});
		
		comboBox1.setBounds(39, 227, 132, 23);
		frmParticipant.getContentPane().add(comboBox1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setEnabled(false);
				txtSurname.setEnabled(false);
				txtDate.setEnabled(false);
				txtTelephoneno.setEnabled(false);
				txtExampeexamplecom.setEnabled(false);
				txtId.setEnabled(false);
				btnSave.setEnabled(false);
				rdbtnNewRadioButton.setEnabled(false);
				//FORM
				btnEditForm.setEnabled(true);
				btnDeleteParticipant.setEnabled(true);
				btnInsetNewForm.setEnabled(true);
				list.setEnabled(true);
				scrollPane.setEnabled(true);
				comboBox1.setEnabled(true);
				if(part==null){
					part= new Participant(txtName.getName(),txtSurname.getText(),txtId.getText(),txtDate.getText(),txtTelephoneno.getText(),txtExampeexamplecom.getText(),rdbtnNewRadioButton.isSelected());
				//todo add him in the list
				}
				else{
					part.modify(txtName.getName(),txtSurname.getText(),txtId.getText(),txtDate.getText(),txtTelephoneno.getText(),txtExampeexamplecom.getText(),rdbtnNewRadioButton.isSelected());
				}
			}
		});
		btnSave.setEnabled(false);
		btnSave.setBounds(430, 117, 89, 23);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frmParticipant.getContentPane().add(btnSave);
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setEnabled(true);
				txtSurname.setEnabled(true);
				txtDate.setEnabled(true);
				txtTelephoneno.setEnabled(true);
				txtExampeexamplecom.setEnabled(true);
				txtId.setEnabled(true);
				btnSave.setEnabled(true);
				rdbtnNewRadioButton.setEnabled(true);
				
				
			}
		});
		btnModify.setBounds(331, 117, 89, 23);
		frmParticipant.getContentPane().add(btnModify);
		
		
		
		txtName = new JTextField();
		txtName.setEnabled(false);
		txtName.setText("Name...");
		txtName.setBounds(159, 47, 124, 20);
		frmParticipant.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setEnabled(false);
		txtSurname.setText("Surname");
		txtSurname.setColumns(10);
		txtSurname.setBounds(369, 47, 124, 20);
		frmParticipant.getContentPane().add(txtSurname);
		
		txtDate = new JTextField();
		txtDate.setEnabled(false);
		txtDate.setText("Date...");
		txtDate.setColumns(10);
		txtDate.setBounds(159, 72, 124, 20);
		frmParticipant.getContentPane().add(txtDate);
		
		txtTelephoneno = new JTextField();
		txtTelephoneno.setEnabled(false);
		txtTelephoneno.setText("TelephoneNo...");
		txtTelephoneno.setColumns(10);
		txtTelephoneno.setBounds(159, 95, 124, 20);
		frmParticipant.getContentPane().add(txtTelephoneno);
		
		txtExampeexamplecom = new JTextField();
		txtExampeexamplecom.setEnabled(false);
		txtExampeexamplecom.setText("exampe@example.com");
		txtExampeexamplecom.setColumns(10);
		txtExampeexamplecom.setBounds(159, 118, 124, 20);
		frmParticipant.getContentPane().add(txtExampeexamplecom);
		
		JLabel lblParticipantDetails = new JLabel("Participant Details");
		lblParticipantDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblParticipantDetails.setBounds(10, 6, 194, 32);
		frmParticipant.getContentPane().add(lblParticipantDetails);
		
		JLabel lblFormsCompleted = new JLabel("Forms Completed");
		lblFormsCompleted.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFormsCompleted.setBounds(10, 184, 194, 32);
		frmParticipant.getContentPane().add(lblFormsCompleted);
		
		JButton button = new JButton("Home <-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmParticipant.setVisible(false);
				initialize();
				HomeScreen.main(null);
			}
		});
		button.setBounds(10, 401, 89, 23);
		frmParticipant.getContentPane().add(button);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(304, 75, 46, 14);
		frmParticipant.getContentPane().add(lblId);
		
		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setEnabled(false);
		txtId.setBounds(369, 72, 124, 20);
		frmParticipant.getContentPane().add(txtId);
		txtId.setColumns(10);
		btnEditForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!list.isSelectionEmpty()){
					String sel_form=(String)list.getSelectedValue();
					int a=Integer.parseInt(sel_form.split("-")[1]);
					for(int i=0;i<part.part_forms.size();i++){
						if(part.part_forms.get(i).ID==a){
							FormA_Screen.fo=part.part_forms.get(i);
						}
					}
				}
				else{
					System.out.println("hhh");
				}
			}
		});
	}
}
