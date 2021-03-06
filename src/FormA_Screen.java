/*
 * SELECT ID FROM PARTICIPANT WHERE ID = @PARTICIPANTID
 * SELECT FORMID FROM FORM WHERE ParticipantID = @PARTICIPANTID
 * */

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

	static private JFrame frame;
	static private final ButtonGroup buttonGroup = new ButtonGroup();
	static private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	static private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	static private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	static private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	static private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	static private JLabel lblprDate;
	static private JRadioButton radioButton = new JRadioButton("���� ��� ����� 5 �����");
	static private JRadioButton radioButton_1 = new JRadioButton("6-30 �����");
	static private JRadioButton radioButton_2 = new JRadioButton("31-60 �����");
	static private JRadioButton radioButton_3 = new JRadioButton("���� ��� 60 �����");
	static private JRadioButton radioButton_4 = new JRadioButton("���");
	static private JRadioButton radioButton_5 = new JRadioButton("���");
	static private JRadioButton radioButton_6 = new JRadioButton("�� ����� ��� ������");
	static private JRadioButton radioButton_7 = new JRadioButton("����������� ����");
	static private JRadioButton radioButton_8 = new JRadioButton("10 � ��������");
	static private JRadioButton radioButton_9 = new JRadioButton("11-20");
	static private JRadioButton radioButton_10 = new JRadioButton("21-30");
	static private JRadioButton radioButton_11 = new JRadioButton("31 � �����������");
	static private JRadioButton radioButton_12 = new JRadioButton("���");
	static private JRadioButton radioButton_13 = new JRadioButton("���");
	static private JRadioButton radioButton_14 = new JRadioButton("���");
	static private JRadioButton radioButton_15 = new JRadioButton("���");
	
	static FormA fo=null;
	static FormA_Screen window = new FormA_Screen();
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*public static void getValues() {
		FormA formAttr = new FormA(Form_type.Form1);
		if(buttonGroup.getSelection().equals(radioButton.getModel())) {
			System.out.println("1");
			formAttr.attributes.add(new obj_Attribute(FormA.formA.get(0).question,Form_type.Form1,null,0,false,1));
		}else {
			if(buttonGroup.getSelection().equals(radioButton_1.getModel())) {
				System.out.println("2");
			}else {
				if(buttonGroup.getSelection().equals(radioButton_2.getModel())) {
					System.out.println("3");
				}else {
					System.out.println("4");
				}
				
			}
		}
	}*/
	
	public static void set_values() {
		if(fo==null)
			return;
		lblprDate.setText(fo.attributes.get(0).text);
		switch(fo.attributes.get(1).value) {
		case 0:
			radioButton.setSelected(true);
			break;
		case 1:
			radioButton.setSelected(false);
			radioButton_1.setSelected(true);
			break;
		case 2:
			radioButton_2.setSelected(true);
			break;
		case 3:
			radioButton_3.setSelected(true);
			break;
		}
		
		switch(fo.attributes.get(2).value) {
		case 0:
			radioButton_4.setSelected(true);
			break;
		case 1:
			radioButton_5.setSelected(true);
			break;
		}
		
		switch(fo.attributes.get(3).value) {
		case 0:
			radioButton_6.setSelected(true);
			break;
		case 1:
			radioButton_7.setSelected(true);
			break;
		}
		
		switch(fo.attributes.get(4).value) {
		case 0:
			radioButton_8.setSelected(true);
			break;
		case 1:
			radioButton_9.setSelected(true);
			break;
		case 2:
			radioButton_10.setSelected(true);
			break;
		case 3:
			radioButton_11.setSelected(true);
			break;
		}
			
		switch(fo.attributes.get(5).value) {
		case 0:
			radioButton_13.setSelected(true);
			break;
		case 1:
			radioButton_12.setSelected(true);
			break;
		}
		
		switch(fo.attributes.get(6).value) {
		case 0:
			radioButton_15.setSelected(true);
			break;
		case 1:
			radioButton_14.setSelected(true);
			break;
		}
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
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel(FormA.formA.get(0).question);
		lblQuestion.setBounds(38, 70, 500, 14);
		
		frame.getContentPane().add(lblQuestion);
		
		JLabel lblQuestion_1 = new JLabel(FormA.formA.get(1).question);
		lblQuestion_1.setBounds(38, 95+20, 900, 14);
		frame.getContentPane().add(lblQuestion_1);
		
		JLabel lblQuestion_2 = new JLabel(FormA.formA.get(2).question);
		lblQuestion_2.setBounds(38, 120+40, 500, 14);
		frame.getContentPane().add(lblQuestion_2);
		
		JLabel lblQuestion_3 = new JLabel(FormA.formA.get(3).question);
		lblQuestion_3.setBounds(38, 145+60, 500, 14);
		frame.getContentPane().add(lblQuestion_3);
		
		JLabel lblQuestion_4 = new JLabel(FormA.formA.get(4).question);
		lblQuestion_4.setBounds(38, 170+80, 500, 14);
		frame.getContentPane().add(lblQuestion_4);
		
		JLabel lblQuestion_5 = new JLabel(FormA.formA.get(5).question);
		lblQuestion_5.setBounds(38, 195+100, 500, 14);
		frame.getContentPane().add(lblQuestion_5);
		
		radioButton.setEnabled(false);
		radioButton.setSelected(true);
		buttonGroup.add(radioButton);
		radioButton.setBounds(50, 66+25, 180, 23);
		frame.getContentPane().add(radioButton);
		
		radioButton_1.setEnabled(false);
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(250, 66+25, 180, 23);
		frame.getContentPane().add(radioButton_1);
		
		
		radioButton_2.setEnabled(false);
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(450, 66+25, 180, 23);
		frame.getContentPane().add(radioButton_2);
		
		
		radioButton_3.setEnabled(false);
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(650, 66+25, 180, 23);
		frame.getContentPane().add(radioButton_3);
		
		
		radioButton_4.setEnabled(false);
		radioButton_4.setSelected(true);
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(50, 91+45, 180, 23);
		frame.getContentPane().add(radioButton_4);
		
		
		radioButton_5.setEnabled(false);
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(250, 91+45, 180, 23);
		frame.getContentPane().add(radioButton_5);
		
		JLabel lblForma = new JLabel("FormA");
		lblForma.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblForma.setBounds(38, 11, 97, 32);
		frame.getContentPane().add(lblForma);
		
		
		radioButton_6.setEnabled(false);
		radioButton_6.setSelected(true);
		buttonGroup_2.add(radioButton_6);
		radioButton_6.setBounds(50, 116+65, 180, 23);
		frame.getContentPane().add(radioButton_6);
		
		
		radioButton_7.setEnabled(false);
		buttonGroup_2.add(radioButton_7);
		radioButton_7.setBounds(250, 116+65, 180, 23);
		frame.getContentPane().add(radioButton_7);
		
		
		radioButton_8.setEnabled(false);
		radioButton_8.setSelected(true);
		buttonGroup_3.add(radioButton_8);
		radioButton_8.setBounds(50, 141+85, 180, 23);
		frame.getContentPane().add(radioButton_8);
		
		
		radioButton_9.setEnabled(false);
		buttonGroup_3.add(radioButton_9);
		radioButton_9.setBounds(250, 141+85, 180, 23);
		frame.getContentPane().add(radioButton_9);
		
		radioButton_10.setEnabled(false);
		buttonGroup_3.add(radioButton_10);
		radioButton_10.setBounds(450, 141+85, 180, 23);
		frame.getContentPane().add(radioButton_10);
		
		
		radioButton_11.setEnabled(false);
		buttonGroup_3.add(radioButton_11);
		radioButton_11.setBounds(650, 141+85, 180, 23);
		frame.getContentPane().add(radioButton_11);
		
		
		radioButton_12.setEnabled(false);
		buttonGroup_4.add(radioButton_12);
		radioButton_12.setBounds(250, 166+105, 180, 23);
		frame.getContentPane().add(radioButton_12);
		
		
		radioButton_13.setEnabled(false);
		radioButton_13.setSelected(true);
		buttonGroup_4.add(radioButton_13);
		radioButton_13.setBounds(50, 166+105, 180, 23);
		frame.getContentPane().add(radioButton_13);
		
		
		radioButton_14.setEnabled(false);
		buttonGroup_5.add(radioButton_14);
		radioButton_14.setBounds(250, 191+130, 180, 23);
		frame.getContentPane().add(radioButton_14);
		
		
		radioButton_15.setEnabled(false);
		radioButton_15.setSelected(true);
		buttonGroup_5.add(radioButton_15);
		radioButton_15.setBounds(50, 191+130, 180, 23);
		frame.getContentPane().add(radioButton_15);
		LocalDate localDate = LocalDate.now();
		lblprDate = new JLabel(dtf.format(localDate));
		lblprDate.setBounds(800, 23, 88, 14);
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
				//getValues();
				if(fo!=null){
					for(int i=0;i<Participant_Screen.part.part_forms.size();i++){
						if(Participant_Screen.part.part_forms.get(i).ID==fo.ID){
							Participant_Screen.part.part_forms.remove(i);
							FormA.delete_form();
							break;
						}
					}
				}
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
				//Participant_Screen.part.part_forms.contains(o)
				Participant_Screen.part.part_forms.add(f);
				Participant_Screen.show();
			}
		});
		btnSave.setBounds(158, 191+130+20+30, 89, 23);
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
		btnModify.setBounds(38, 191+130+20+30, 89, 23);
		frame.getContentPane().add(btnModify);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(750, 23, 41, 14);
		frame.getContentPane().add(lblDate);
	}
}
