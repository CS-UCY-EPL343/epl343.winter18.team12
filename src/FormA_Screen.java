import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class FormA_Screen {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	
	
	static FormA fo=null;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormA_Screen window = new FormA_Screen();
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
	public FormA_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 361);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question1");
		lblQuestion.setBounds(38, 70, 88, 14);
		frame.getContentPane().add(lblQuestion);
		
		JLabel lblQuestion_1 = new JLabel("Question2");
		lblQuestion_1.setBounds(38, 95, 71, 14);
		frame.getContentPane().add(lblQuestion_1);
		
		JLabel lblQuestion_2 = new JLabel("Question3");
		lblQuestion_2.setBounds(38, 120, 71, 14);
		frame.getContentPane().add(lblQuestion_2);
		
		JLabel lblQuestion_3 = new JLabel("Question4");
		lblQuestion_3.setBounds(38, 145, 71, 14);
		frame.getContentPane().add(lblQuestion_3);
		
		JLabel lblQuestion_4 = new JLabel("Question5");
		lblQuestion_4.setBounds(38, 170, 71, 14);
		frame.getContentPane().add(lblQuestion_4);
		
		JLabel lblQuestion_5 = new JLabel("Question6");
		lblQuestion_5.setBounds(38, 195, 71, 14);
		frame.getContentPane().add(lblQuestion_5);
		
		JRadioButton radioButton = new JRadioButton("0");
		radioButton.setEnabled(false);
		radioButton.setSelected(true);
		buttonGroup.add(radioButton);
		radioButton.setBounds(115, 66, 41, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("1");
		radioButton_1.setEnabled(false);
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(158, 66, 41, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("2");
		radioButton_2.setEnabled(false);
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(201, 66, 41, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("3");
		radioButton_3.setEnabled(false);
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(244, 66, 41, 23);
		frame.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("0");
		radioButton_4.setEnabled(false);
		radioButton_4.setSelected(true);
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(115, 91, 41, 23);
		frame.getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("1");
		radioButton_5.setEnabled(false);
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(158, 91, 41, 23);
		frame.getContentPane().add(radioButton_5);
		
		JLabel lblForma = new JLabel("FormA");
		lblForma.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblForma.setBounds(38, 11, 97, 32);
		frame.getContentPane().add(lblForma);
		
		JRadioButton radioButton_6 = new JRadioButton("0");
		radioButton_6.setEnabled(false);
		radioButton_6.setSelected(true);
		buttonGroup_2.add(radioButton_6);
		radioButton_6.setBounds(115, 116, 41, 23);
		frame.getContentPane().add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("1");
		radioButton_7.setEnabled(false);
		buttonGroup_2.add(radioButton_7);
		radioButton_7.setBounds(158, 116, 41, 23);
		frame.getContentPane().add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("0");
		radioButton_8.setEnabled(false);
		radioButton_8.setSelected(true);
		buttonGroup_3.add(radioButton_8);
		radioButton_8.setBounds(115, 141, 41, 23);
		frame.getContentPane().add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("1");
		radioButton_9.setEnabled(false);
		buttonGroup_3.add(radioButton_9);
		radioButton_9.setBounds(158, 141, 41, 23);
		frame.getContentPane().add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("2");
		radioButton_10.setEnabled(false);
		buttonGroup_3.add(radioButton_10);
		radioButton_10.setBounds(201, 141, 41, 23);
		frame.getContentPane().add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("3");
		radioButton_11.setEnabled(false);
		buttonGroup_3.add(radioButton_11);
		radioButton_11.setBounds(244, 141, 41, 23);
		frame.getContentPane().add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("1");
		radioButton_12.setEnabled(false);
		buttonGroup_4.add(radioButton_12);
		radioButton_12.setBounds(158, 166, 41, 23);
		frame.getContentPane().add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("0");
		radioButton_13.setEnabled(false);
		radioButton_13.setSelected(true);
		buttonGroup_4.add(radioButton_13);
		radioButton_13.setBounds(115, 166, 41, 23);
		frame.getContentPane().add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("1");
		radioButton_14.setEnabled(false);
		buttonGroup_5.add(radioButton_14);
		radioButton_14.setBounds(158, 191, 41, 23);
		frame.getContentPane().add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("0");
		radioButton_15.setEnabled(false);
		radioButton_15.setSelected(true);
		buttonGroup_5.add(radioButton_15);
		radioButton_15.setBounds(115, 191, 41, 23);
		frame.getContentPane().add(radioButton_15);
		LocalDate localDate = LocalDate.now();
		JLabel lblprDate = new JLabel(dtf.format(localDate));
		lblprDate.setBounds(393, 23, 88, 14);
		frame.getContentPane().add(lblprDate);
	
		
		JButton btnSave = new JButton("Save");
		btnSave.setEnabled(false);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButton.setEnabled(false);
				radioButton_1.setEnabled(false);
				radioButton_2.setEnabled(false);
				radioButton_3.setEnabled(false);
				radioButton_4.setEnabled(false);
				radioButton_5.setEnabled(false);
				radioButton_6.setEnabled(false);
				radioButton_7.setEnabled(false);
				radioButton_8.setEnabled(false);
				radioButton_9.setEnabled(false);
				radioButton_10.setEnabled(false);
				radioButton_11.setEnabled(false);
				radioButton_12.setEnabled(false);
				radioButton_13.setEnabled(false);
				radioButton_14.setEnabled(false);
				radioButton_15.setEnabled(false);
				btnSave.setEnabled(false);
				FormA f=new FormA(Form_type.Form1);
				obj_Attribute q0=new obj_Attribute("Date",Form_type.Form1,lblprDate.getText(),0, false, 0);
				f.add_attrib(q0);
				if(radioButton.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question1",Form_type.Form1,null,0, false, 1);
					f.add_attrib(q1);
				}
				else if(radioButton_1.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question1",Form_type.Form1,null,1, false, 1);
					f.add_attrib(q1);
				}
				else if(radioButton_2.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question1",Form_type.Form1,null,2, false, 1);
					f.add_attrib(q1);
				}
				else {
					obj_Attribute q1=new obj_Attribute("Question1",Form_type.Form1,null,3, false, 1);
					f.add_attrib(q1);
				}
				if(radioButton_4.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question2",Form_type.Form1,null,0, false, 1);
					f.add_attrib(q1);
				}
				else {
					obj_Attribute q1=new obj_Attribute("Question2",Form_type.Form1,null,1, false, 1);
					f.add_attrib(q1);
				}
				
				if(radioButton_6.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question3",Form_type.Form1,null,0, false, 1);
					f.add_attrib(q1);
				}
				else {
					obj_Attribute q1=new obj_Attribute("Question3",Form_type.Form1,null,1, false, 1);
					f.add_attrib(q1);
				}
				
				if(radioButton_8.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question4",Form_type.Form1,null,0, false, 1);
					f.add_attrib(q1);
				}
				else if(radioButton_9.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question4",Form_type.Form1,null,1, false, 1);
					f.add_attrib(q1);
				}
				else if(radioButton_10.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question4",Form_type.Form1,null,2, false, 1);
					f.add_attrib(q1);
				}
				else {
					obj_Attribute q1=new obj_Attribute("Question4",Form_type.Form1,null,3, false, 1);
					f.add_attrib(q1);
				}
				
				if(radioButton_13.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question5",Form_type.Form1,null,0, false, 1);
					f.add_attrib(q1);
				}
				else {
					obj_Attribute q1=new obj_Attribute("Question5",Form_type.Form1,null,1, false, 1);
					f.add_attrib(q1);
				}
				if(radioButton_15.isSelected()){
					obj_Attribute q1=new obj_Attribute("Question6",Form_type.Form1,null,0, false, 1);
					f.add_attrib(q1);
				}
				else {
					obj_Attribute q1=new obj_Attribute("Question6",Form_type.Form1,null,1, false, 1);
					f.add_attrib(q1);
				}
				if(fo!=null){
					for(int i=0;i<Participant_Screen.part.part_forms.size();i++){
						if(Participant_Screen.part.part_forms.get(i).ID==fo.ID){
							Participant_Screen.part.part_forms.remove(i);
						}
					}
				}
				//Participant_Screen.part.part_forms.contains(o)
				Participant_Screen.part.part_forms.add(f);
			}
		});
		btnSave.setBounds(158, 254, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSave.setEnabled(true);
				radioButton.setEnabled(true);
				radioButton_1.setEnabled(true);
				radioButton_2.setEnabled(true);
				radioButton_3.setEnabled(true);
				radioButton_4.setEnabled(true);
				radioButton_5.setEnabled(true);
				radioButton_6.setEnabled(true);
				radioButton_7.setEnabled(true);
				radioButton_8.setEnabled(true);
				radioButton_9.setEnabled(true);
				radioButton_10.setEnabled(true);
				radioButton_11.setEnabled(true);
				radioButton_12.setEnabled(true);
				radioButton_13.setEnabled(true);
				radioButton_14.setEnabled(true);
				radioButton_15.setEnabled(true);
			
			}
		});
		btnModify.setBounds(38, 254, 89, 23);
		frame.getContentPane().add(btnModify);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(343, 23, 41, 14);
		frame.getContentPane().add(lblDate);
	}
}
