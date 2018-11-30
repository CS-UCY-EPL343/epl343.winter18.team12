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
	private JFrame frame;
	static ArrayList<Participant> result_part = new ArrayList<Participant>();
	static Result_Screen window = new Result_Screen();
	static JList list;
	static JScrollPane scrollPane;
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

	/*public static void set_list(){
		result_part.add(new Participant("aaa","bbb","r","ddd","eee","fff",true));						//HERE
		String array[]= new String[result_part.size()];
		//String array[]= new String[40];
		for(int i=0;i<array.length;i++) {
			array[i]="participant-"+result_part.get(i).ID.text;
			//array[i]="participant-"+i;
		}
		list = new JList(array);
		scrollPane.setViewportView(list);
	}*/
	
	
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
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(46, 100, 331, 166);
		frame.getContentPane().add(scrollPane);
		
		result_part.addAll(Home_Screen.all_part);
		String array[]= new String[result_part.size()];
		//String array[]= new String[40];
		for(int i=0;i<array.length;i++) {
			array[i]="participant-"+result_part.get(i).ID.text;
			//array[i]="participant-"+i;
		}
		list = new JList(array);
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
					Participant_Screen.stars();
					Participant_Screen.setValue();
					Participant_Screen.pothen_irtes=false;
				}
				
			}
		});
		button.setBounds(387, 175, 106, 23);
		frame.getContentPane().add(button);
		// set_list();
	}
}
