import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.Color;

public class Calculations_Screen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	static ArrayList<Participant> calculation_part =new ArrayList<Participant>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculations_Screen frame = new Calculations_Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculations_Screen() {
		setTitle("Calculate average and standard deviation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(393, 35, 393, 216);
		contentPane.add(scrollPane);
		
		JList<String> list = new JList<String>();
		JList<Attribute> list_1 = new JList<Attribute>();

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				Attribute values[]=null;
				
				switch((String)list.getSelectedValue()) {
				
				case "Participant": 
					Object formAttributesGeneric[]=null;
					try {
					formAttributesGeneric=FormA.formParticipant.toArray();
					}catch(Exception e) {
						System.out.println("Dont run it before running Home Screen");
						System.exit(0);
					}
					Attribute formAttributes[]=new Attribute[formAttributesGeneric.length];
							for(int i=0;i<formAttributesGeneric.length;i++) {
								formAttributes[i]=(Attribute)formAttributesGeneric[i];
							}
					values=formAttributes;
					
					break;
				
				case "Form1": 
					formAttributesGeneric=null;
					try {
					formAttributesGeneric=FormA.formA.toArray();
				}catch(Exception e) {
					System.out.println("Dont run it before running Home Screen");
					System.exit(0);
				}
					formAttributes=new Attribute[formAttributesGeneric.length];
							for(int i=0;i<formAttributesGeneric.length;i++) {
								formAttributes[i]=(Attribute)formAttributesGeneric[i];
							}
					values=formAttributes;
					break;
					
				}
				list_1.setListData(values);
			}
		});
		scrollPane.setViewportView(list_1);
		List<String> values1=new ArrayList<String>();
		for(Form_type i : Form_type.values()){
			values1.add(i.toString());
		}
		list.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			List<String> values=values1;
			
				//new ArrayList[] {"Form1", "Form2", "Form3", "Form4", "Form5", "Form6", "Form7", "Form8", "Form9", "Form10"};
			
			public int getSize() {
				return values.size();
			}
			public String getElementAt(int index) {
				return values.get(index);
			}
		});
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(243, 35, 127, 216);
		contentPane.add(scrollPane_1);
		
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(list);
		
		JRadioButton rdbtnAverage = new JRadioButton("Average");
		buttonGroup.add(rdbtnAverage);
		rdbtnAverage.setBounds(21, 48, 109, 23);
		contentPane.add(rdbtnAverage);
		
		JRadioButton rdbtnStandardDeviation = new JRadioButton("Standard deviation");
		buttonGroup.add(rdbtnStandardDeviation);
		rdbtnStandardDeviation.setBounds(21, 74, 139, 23);
		contentPane.add(rdbtnStandardDeviation);
		
		rdbtnAverage.setSelected(true);
		
		JLabel lblForms = new JLabel("Forms");
		lblForms.setBounds(243, 10, 72, 14);
		contentPane.add(lblForms);
		
		JLabel lblAttributes = new JLabel("Attributes");
		lblAttributes.setBounds(393, 10, 79, 14);
		contentPane.add(lblAttributes);
		
		textField = new JTextField();
		textField.setBounds(88, 114, 50, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFormNo = new JLabel("Form No.");
		lblFormNo.setBounds(21, 117, 57, 14);
		contentPane.add(lblFormNo);
		
		JButton btnLast = new JButton("Last");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("last");
			}
		});
		btnLast.setBounds(161, 116, 72, 14);
		contentPane.add(btnLast);
		
		JButton btnFirst = new JButton("First");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("first");
			}
		});
		btnFirst.setBounds(161, 92, 72, 14);
		contentPane.add(btnFirst);
		
		JLabel lblNewLabel = new JLabel("Result:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(21, 280, 109, 23);
		contentPane.add(lblNewLabel);
		
		JLabel Answer = new JLabel("");
		Answer.setForeground(Color.RED);
		Answer.setFont(new Font("Tahoma", Font.BOLD, 18));
		Answer.setBounds(21, 314, 765, 30);
		contentPane.add(Answer);
		
		JButton btnAll = new JButton("All");
		btnAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("all");
			}
		});
		btnAll.setBounds(161, 140, 72, 14);
		contentPane.add(btnAll);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAverage.isSelected())
				Answer.setText("Average of "+"\""+list_1.getSelectedValue().question+"\""+" = 2");
				else
					Answer.setText("Standard Deviation of "+"\""+list_1.getSelectedValue().question+"\""+" = 2");
					
			}
		});
		btnCalculate.setBounds(243, 262, 89, 23);
		contentPane.add(btnCalculate);
	}
}
