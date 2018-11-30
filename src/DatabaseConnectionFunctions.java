import java.io.*;
import java.sql.*;
import java.util.*;

import org.omg.PortableInterceptor.SUCCESSFUL;
public class DatabaseConnectionFunctions {
	private static boolean dbDriverLoaded = false;
	static Connection conn = null;

	/**
	 * A method that returns a connection to MS SQL server DB
	 *
	 * @return The connection object to be used.
	 */
	static Connection getDBConnection() {
		String dbConnString = "jdbc:sqlserver://APOLLO.in.cs.ucy.ac.cy:1433;databaseName=aproxe01;user=aproxe01;password=*******;";

		if (!dbDriverLoaded)
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				dbDriverLoaded = true;
			} catch (ClassNotFoundException e) {
				System.out.println("Cannot load DB driver!");
				return null;
			}

		try {
			if (conn == null)
				conn = DriverManager.getConnection(dbConnString);
			else if (conn.isClosed())
				conn = DriverManager.getConnection(dbConnString);
		} catch (SQLException e) {
			System.out.print("Cannot connect to the DB!\nGot error: ");
			System.out.print(e.getErrorCode());
			System.out.print("\nSQL State: ");
			System.out.println(e.getSQLState());
			System.out.println(e.getMessage());
		}
		return conn;
	}
	public static void sendBatchQuery(String query) throws SQLException{
		conn=Home_Screen.dataBaseConnection;
		System.out.println(query);
		ResultSet rs = null;
		Statement stmt =null;
		int []upadateCounts=null;
		stmt = conn.createStatement();
		conn.setAutoCommit(false);
		conn.setHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT);
		stmt.addBatch(query);
		upadateCounts=stmt.executeBatch();
		conn.commit();
	}
	
	public static void executeQueryUploadDatabase(String query) throws SQLException{
		conn=Home_Screen.dataBaseConnection;
		System.out.println(query);
		ResultSet rs = null;
		conn.setHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT);
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,ResultSet.CLOSE_CURSORS_AT_COMMIT);
		conn.setAutoCommit(false);
		rs = stmt.executeQuery(query);
		while (rs.next()) {
			Home_Screen.part_list.add(new Participant(rs.getString("Name"),rs.getString("Surname"),
					rs.getString("PartID"),rs.getString("DateOfBirth"),rs.getInt("TelNo")+"",rs.getString("Email"),rs.getInt("Smoker")==1));
			Home_Screen.all_part.add(new Participant(rs.getString("Name"),rs.getString("Surname"),
					rs.getString("PartID"),rs.getString("DateOfBirth"),rs.getInt("TelNo")+"",rs.getString("Email"),rs.getInt("Smoker")==1));
			
		}
	}
	
	public static void executeQueryUploadFormsPerParticipant(int partID) throws SQLException{
		conn=Home_Screen.dataBaseConnection;
		ResultSet rs = null;
		conn.setHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT);
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY,ResultSet.CLOSE_CURSORS_AT_COMMIT);
		conn.setAutoCommit(false);
		String query="SELECT * FROM FORMA WHERE PartID="+partID;
		rs = stmt.executeQuery(query);
		
		
		while (rs.next()) {
			Home_Screen.all_part.get(partID).part_forms.add(new FormA(Form_type.Form1));
		//Home_Screen.all_part.get(partID).part_forms.get(Home_Screen.all_part.get(partID).part_forms.size()-1).attributes.add();
			
		}
	}



}
