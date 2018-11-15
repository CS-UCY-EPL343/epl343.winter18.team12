import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class Search_Screen {

	private JFrame frmSearch;

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
		frmSearch = new JFrame();
		frmSearch.setTitle("Search");
		frmSearch.setBounds(100, 100, 450, 300);
		frmSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearch.getContentPane().setLayout(null);
		
		JLabel lblAttributesToSearch = new JLabel("Attributes to Search");
		lblAttributesToSearch.setBounds(10, 10, 120, 13);
		frmSearch.getContentPane().add(lblAttributesToSearch);
		
		JLabel lblForms = new JLabel("Forms");
		lblForms.setBounds(189, 10, 58, 13);
		frmSearch.getContentPane().add(lblForms);
		
		JLabel lblNewLabel = new JLabel("Attributes of Form");
		lblNewLabel.setBounds(294, 10, 120, 13);
		frmSearch.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(160, 33, 106, 133);
		frmSearch.getContentPane().add(scrollPane);
		JList list_1 = new JList();
		JList list = new JList();
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
				String values[]=new String[5];
				switch((String)list.getSelectedValue()) {
				case "Participant": 
					for(int i=0;i<FormA.formParticipant.size();i++) {
						values[i]="Question "+i;
					}
					
					break;
				
				case "Form1": 
					for(int i=0;i<FormA.formA.size();i++) {
						values[i]="Question "+i;
					}
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
		list.setModel(new AbstractListModel() {
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
		scrollPane_1.setBounds(285, 33, 129, 133);
		frmSearch.getContentPane().add(scrollPane_1);
		

		scrollPane_1.setViewportView(list_1);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Attr1_Form1", "Attr1_Form2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp=(String)list_1.getSelectedValue();
				if(tmp==null)
					System.out.println(""); //todo
				else{
				}
			}
		});
		btnAdd.setBounds(329, 176, 85, 21);
		frmSearch.getContentPane().add(btnAdd);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(10, 182, 85, 21);
		frmSearch.getContentPane().add(btnSearch);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 33, 106, 139);
		frmSearch.getContentPane().add(scrollPane_2);
		
		list_2.setEnabled(false);
		scrollPane_2.setViewportView(list_2);
		
		JButton btnHome = new JButton("Home <-");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSearch.setVisible(false);
				HomeScreen.main(null);
			}
		});
		btnHome.setBounds(10, 227, 89, 23);
		frmSearch.getContentPane().add(btnHome);
	}
}
