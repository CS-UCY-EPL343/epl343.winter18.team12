import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Result_Screen {
	static Result_Screen window = new Result_Screen();
	private JFrame frame;

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

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Result_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 519, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(46, 100, 331, 166);
		frame.getContentPane().add(scrollPane);
		
		String array[]= new String[40];
		for(int i=0;i<array.length;i++) {
			array[i]="participant"+(i);
		}
		JList list = new JList(array);
		scrollPane.setViewportView(list);
		
		JButton btnSelectAll = new JButton("Select All");
		btnSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					
					list.setSelectionInterval(0, 39);
					
				
			}
		});
		btnSelectAll.setBounds(387, 243, 106, 23);
		frame.getContentPane().add(btnSelectAll);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResults.setBounds(46, 11, 97, 32);
		frame.getContentPane().add(lblResults);
		
		JButton btnCalculations = new JButton("Calculations");
		btnCalculations.setBounds(387, 209, 106, 23);
		frame.getContentPane().add(btnCalculations);
		
		JButton button = new JButton("View Details");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frame.setVisible(false);
				LogIn_Screen.state=1;
				Participant_Screen.main(array);
				
			}
		});
		button.setBounds(387, 175, 106, 23);
		frame.getContentPane().add(button);
		
	}
}
