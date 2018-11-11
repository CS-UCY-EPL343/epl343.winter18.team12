import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class HomeScreen {

	private JFrame frmHomeScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frmHomeScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomeScreen = new JFrame();
		frmHomeScreen.setTitle("Home screen");
		frmHomeScreen.getContentPane().setForeground(Color.BLUE);
		frmHomeScreen.setBounds(100, 100, 543, 403);
		frmHomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHomeScreen.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.setBounds(190, 167, 152, 42);
		frmHomeScreen.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LOGOUT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(403, 301, 89, 23);
		frmHomeScreen.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("ADD PARTICIPANT");
		btnNewButton.setBounds(190, 105, 152, 42);
		frmHomeScreen.getContentPane().add(btnNewButton);
	}
}
