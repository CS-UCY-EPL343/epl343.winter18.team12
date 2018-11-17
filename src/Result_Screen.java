import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Result_Screen {
	static Result_Screen window = new Result_Screen();
	private JFrame frame;
	static ArrayList<Participant> result_part =new ArrayList<Participant>();

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
		
		//String array[]= new String[result_part.size()];
		String array[]= new String[40];
		for(int i=0;i<array.length;i++) {
			//array[i]="participant-"+result_part.get(i).ID.text;
			array[i]="participant-"+i;
		}
		JList list = new JList(array);
		scrollPane.setViewportView(list);
		
		JButton btnSelectAll = new JButton("Select All");
		btnSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					list.setSelectionInterval(0, array.length-1);
			}
		});
		btnSelectAll.setBounds(387, 243, 106, 23);
		frame.getContentPane().add(btnSelectAll);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResults.setBounds(46, 11, 97, 32);
		frame.getContentPane().add(lblResults);
		
		JButton btnCalculations = new JButton("Calculations");
		btnCalculations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int size=list.getSelectedIndices().length;
				if(size<1) {
					JOptionPane.showMessageDialog(frame, "Choose at least one Participant!!!", "WARNING",JOptionPane.ERROR_MESSAGE);
				}
				else {
					window.frame.setVisible(false);
					Calculations_Screen.main(null);
					int []temp=list.getSelectedIndices();
					for(int i=0;i<temp.length;i++) {
						Calculations_Screen.calculation_part.add(result_part.get(temp[i]));
					}
				}
			}
		});
		btnCalculations.setBounds(387, 209, 106, 23);
		frame.getContentPane().add(btnCalculations);
		
		JButton button = new JButton("View Details");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LogIn_Screen.state=1;
				int size=list.getSelectedIndices().length;
				if(size<1) {
					JOptionPane.showMessageDialog(frame, "Choose one Participant!!!", "WARNING",JOptionPane.ERROR_MESSAGE);
				}
				else if(size>1) {
					JOptionPane.showMessageDialog(frame, "Choose only one Participant!!!", "WARNING",JOptionPane.ERROR_MESSAGE);
				}
				else {
					window.frame.setVisible(false);
					Participant_Screen.main(null);
					Participant_Screen.part=result_part.get(list.getSelectedIndex());
				}
				
			}
		});
		button.setBounds(387, 175, 106, 23);
		frame.getContentPane().add(button);
		
	}
}
