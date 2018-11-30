import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import com.microsoft.sqlserver.*;

public class Home_Screen {
	static Home_Screen window = new Home_Screen();
	private JFrame frmHomeScreen;
	public static ArrayList<Participant> part_list =new ArrayList<Participant>();
	public static List<FormA> formList = new ArrayList<FormA>();
	public static ArrayList<Participant> all_part=new ArrayList<Participant>();
	public static Connection dataBaseConnection =null;
	public static boolean opening=true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(opening){
					dataBaseConnection=DatabaseConnectionFunctions.getDBConnection();
					String uploadQuery="SELECT * FROM PARTICIPANT";
					DatabaseConnectionFunctions.executeQueryUploadDatabase(uploadQuery);
					for(int i=0;i<all_part.size();i++){
						DatabaseConnectionFunctions.executeQueryUploadFormsPerParticipant(i);
					}
					opening=false;
					}
					window.frmHomeScreen.setVisible(true);
					
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
	public Home_Screen() {
		initialize();
		FormA.create_form();
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frmHomeScreen.hide();
				Search_Screen.main(null);
				System.out.println(formList.size());
				//System.out.println(formList.get(1).formAttributes.get(0).question);
//				for(int i=0;i<formList.size();i++){
//					System.out.println(formList.get(i).formAttributes.get(0).question);
//				}
			}
		});
		btnNewButton_1.setBounds(190, 167, 152, 42);
		frmHomeScreen.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LOGOUT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					DatabaseConnectionFunctions.sendBatchQuery("DELETE FORMA");
					DatabaseConnectionFunctions.sendBatchQuery("DELETE PARTICIPANT");
					for(int i=0;i<all_part.size();i++){
						if(all_part.get(i).smoker.answer==true){
						DatabaseConnectionFunctions.sendBatchQuery("INSERT INTO PARTICIPANT VALUES('"+all_part.get(i).ID.text+"','"+
					all_part.get(i).Fname.text+"', '"+all_part.get(i).Sname.text+"', '"+all_part.get(i).DateOfBirth.text+"', '"+
					1+"','"+all_part.get(i).Telephone.text+"','"+all_part.get(i).email.text+"')");
						}else{
							DatabaseConnectionFunctions.sendBatchQuery("INSERT INTO PARTICIPANT VALUES('"+all_part.get(i).ID.text+"','"+all_part.get(i).Fname.text+"', '"+all_part.get(i).Sname.text+"', '"+all_part.get(i).DateOfBirth.text+"', '"+0+"','"+all_part.get(i).Telephone.text+"','"+all_part.get(i).email.text+"')");
						}
						String insertForm="INSERT INTO FORMA VALUES('";
						insertForm+=all_part.get(i).ID.text+"','";
						//String insertForm="INSERT INTO PARTICIPANT VALUES('"+all_part.get(i).ID.text+"','"+all_part.get(i).part_forms.+"'";
						for(int j=0;j<all_part.get(i).part_forms.size();j++){
							insertForm+=all_part.get(i).part_forms.get(j).ID+"','";
							
					
							
							for(int k=0;k<all_part.get(i).part_forms.get(j).attributes.size();k++){
								insertForm+=all_part.get(i).part_forms.get(j).attributes.get(k).value+"','";
							}
							
						}
						if(all_part.get(i).part_forms.size()>0){
							insertForm=insertForm.substring(0, insertForm.length()-2);
							
						DatabaseConnectionFunctions.sendBatchQuery(insertForm+")");
						}
					}
					dataBaseConnection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				window.frmHomeScreen.hide();
				LogIn_Screen.window.frmLogin.show();
			}
			
		});
		btnNewButton_2.setBounds(403, 301, 89, 23);
		frmHomeScreen.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("ADD PARTICIPANT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frmHomeScreen.hide();
				LogIn_Screen.state=0;
				Participant_Screen.main(null);
				Participant_Screen.part=null;
				Participant_Screen.pothen_irtes=true;
			}
		});
		btnNewButton.setBounds(190, 105, 152, 42);
		frmHomeScreen.getContentPane().add(btnNewButton);
	}
}
