package applcation;

import java.sql.*;

public class Drive {

	private static final String URL = "jdbc:mysql://localhost:3306/tbl_20";
	private static final String USER = "root";
	private static final String PASSWRD = "1234";
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USER, PASSWRD);
			
			System.out.println("OK");
			
			con.close();
		}
	
		catch (Exception ex) {
			System.out.println("ERROR");
		}
	
	}

}
