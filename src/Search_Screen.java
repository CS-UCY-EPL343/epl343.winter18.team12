import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.Icon;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class Search_Screen {

	private JFrame frmSearch;
	public static List<obj_Attribute> objAttributesToSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Screen window = new Search_Screen();
					window.frmSearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Search_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 
		List<Attribute> attributesToSearch = new ArrayList<Attribute>();
		objAttributesToSearch =  new ArrayList<obj_Attribute>();
		frmSearch = new JFrame();
		frmSearch.setTitle("Search");
		frmSearch.setBounds(100, 100, 709, 449);
		frmSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearch.getContentPane().setLayout(null);
		
		JLabel lblAttributesToSearch = new JLabel("Attributes to Search");
		lblAttributesToSearch.setBounds(10, 170, 120, 13);
		frmSearch.getContentPane().add(lblAttributesToSearch);
		
		JLabel lblForms = new JLabel("Forms");
		lblForms.setBounds(10, 10, 58, 13);
		frmSearch.getContentPane().add(lblForms);
		
		JLabel lblNewLabel = new JLabel("Attributes of Form");
		lblNewLabel.setBounds(120, 10, 120, 13);
		frmSearch.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 106, 133);
		frmSearch.getContentPane().add(scrollPane);
		JList<Attribute> list_1 = new JList<Attribute>();
		JList<String> list = new JList<String>();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		ArrayList<Attribute> valuesAttr;
//		if(list.getSelectedValue().equals(Form_type.Participant.toString())){
//			valuesAttr=FormA.formParticipant;
//		}else{
//			valuesAttr=FormA.formA;
//		}
//		list_1.setModel(new AbstractListModel() {
//				ArrayList<Attribute> values;
//				//ArrayList<Attribute> values=FormA.formA;
//			public int getSize() {
//				return values.size();
//			}
//			public Attribute getElementAt(int index) {
//				return values.get(index);
//			}
//		});
		
		
		
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
		scrollPane.setViewportView(list);
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
		scrollPane_1.setBounds(121, 26, 453, 133);
		frmSearch.getContentPane().add(scrollPane_1);
		

		scrollPane_1.setViewportView(list_1);
		
		JList<Attribute> list_2 = new JList<Attribute>();
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list_1.getSelectedValue()==null) {JOptionPane.showMessageDialog(null, "Please select Form and Attribute before adding it to search list.");}
				else
				{
					if(attributesToSearch.contains((Attribute)list_1.getSelectedValue())) {
						JOptionPane.showMessageDialog(null, "Already added attribute.");
					}else {
						if((list_1.getSelectedValue().question.equals("Name")||list_1.getSelectedValue().question.equals("Surname"))&&!LogIn_Screen.is_admin()) {
							
							JOptionPane.showMessageDialog(null, "You are not authorized to search using Participant name and surname.", "WARNING",JOptionPane.ERROR_MESSAGE);
						}else {
				attributesToSearch.add((Attribute)list_1.getSelectedValue());
				Object formAttributesGeneric[]=attributesToSearch.toArray();
				Attribute formAttributes[]=new Attribute[formAttributesGeneric.length];
						for(int i=0;i<formAttributesGeneric.length;i++) {
							formAttributes[i]=(Attribute)formAttributesGeneric[i];
						}
				list_2.setListData(formAttributes);
						}
					}
				}
			}
		});
		btnAdd.setBounds(584, 25, 99, 21);
		frmSearch.getContentPane().add(btnAdd);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(10, 344, 89, 23);
		frmSearch.getContentPane().add(btnSearch);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 194, 564, 139);
		frmSearch.getContentPane().add(scrollPane_2);
		scrollPane_2.setViewportView(list_2);
		
		JButton btnHome = new JButton("Home <-");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSearch.setVisible(false);
				Home_Screen.main(null);
			}
		});
		btnHome.setBounds(10, 376, 89, 23);
		frmSearch.getContentPane().add(btnHome);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(attributesToSearch.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nothing to delete.");
				}else {
				if(list_2.getSelectedValue()==null) {JOptionPane.showMessageDialog(null, "Please select Attribute before deleting it from search list.");}
				else
				{
						
				attributesToSearch.remove((Attribute)list_2.getSelectedValue());
				Object formAttributesGeneric[]=attributesToSearch.toArray();
				Attribute formAttributes[]=new Attribute[formAttributesGeneric.length];
						for(int i=0;i<formAttributesGeneric.length;i++) {
							formAttributes[i]=(Attribute)formAttributesGeneric[i];
						}
				list_2.setListData(formAttributes);
						}
					}
				
			}
		});
		btnDelete.setBounds(584, 228, 99, 21);
		frmSearch.getContentPane().add(btnDelete);
		
		JButton btnSetValue = new JButton("Set Value");
		btnSetValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(list_2.getSelectedValue()!=null) {
					SetValue.label = new JLabel("-----------------------");
					SetValue.textField_1 = new JTextField();
					SetValue.rdbtnAllForms= new JRadioButton("All Forms");
				SetValue.label.setText(list_2.getSelectedValue().question);
			
					if(list_2.getSelectedValue().form.equals(Form_type.Participant)) {
						SetValue.textField_1.setText("1");
						SetValue.textField_1.setEnabled(false);
						SetValue.rdbtnAllForms.setSelected(false);
						SetValue.rdbtnAllForms.setEnabled(false);
					
					}
					SetValue.main(null);
				}
				
				
				
				
			}
			
		});
		btnSetValue.setBounds(584, 193, 99, 21);
		frmSearch.getContentPane().add(btnSetValue);
	}
}
