import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.Color;

public class Calculations_Screen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 571, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(393, 35, 152, 216);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(243, 35, 127, 216);
		contentPane.add(scrollPane_1);
		
		JList list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(list_1);
		
		JRadioButton rdbtnAverage = new JRadioButton("Average");
		buttonGroup.add(rdbtnAverage);
		rdbtnAverage.setBounds(21, 48, 109, 23);
		contentPane.add(rdbtnAverage);
		
		JRadioButton rdbtnStandardDeviation = new JRadioButton("Standard deviation");
		buttonGroup.add(rdbtnStandardDeviation);
		rdbtnStandardDeviation.setBounds(21, 74, 131, 23);
		contentPane.add(rdbtnStandardDeviation);
		
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
		btnLast.setBounds(148, 129, 72, 14);
		contentPane.add(btnLast);
		
		JButton btnFirst = new JButton("First");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("first");
			}
		});
		btnFirst.setBounds(148, 104, 72, 14);
		contentPane.add(btnFirst);
		
		JLabel lblNewLabel = new JLabel("Result:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(21, 189, 109, 23);
		contentPane.add(lblNewLabel);
		
		JLabel Answer = new JLabel("");
		Answer.setForeground(Color.RED);
		Answer.setFont(new Font("Tahoma", Font.BOLD, 18));
		Answer.setBounds(21, 237, 96, 30);
		contentPane.add(Answer);
	}
}
