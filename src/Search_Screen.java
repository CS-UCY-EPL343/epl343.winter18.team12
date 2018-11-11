import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
	}

}
