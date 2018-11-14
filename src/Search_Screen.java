import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Form1", "Form2", "Form3", "Form4", "Form5", "Form6", "Form7", "Form8", "Form9", "Form10"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(285, 33, 129, 133);
		frmSearch.getContentPane().add(scrollPane_1);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Attribute1", "Attribute2", "Attribute3", "Attribute4", "Attribute5", "Attribute6", "Attribute7", "Attribute8", "Attribute9", "Attribute10", "Attribute11"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list_1);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(329, 176, 85, 21);
		frmSearch.getContentPane().add(btnAdd);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(10, 182, 85, 21);
		frmSearch.getContentPane().add(btnSearch);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 33, 106, 139);
		frmSearch.getContentPane().add(scrollPane_2);
		
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
