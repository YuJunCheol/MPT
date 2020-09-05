package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBConnect {

	protected Connection con;
	protected Statement st;
	protected ResultSet rs; 
	protected int r,r2; 
	// MySql 0.8 버전 이상부터 진행.
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/mobilept?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PW = "1234";
	
	public DBConnect () {
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,USER,PW);
			st = con.createStatement();
		}catch(Exception e) {
			System.out.println("(ERROR)DB.DBConnection: " + e.getMessage());
			//e.printStackTrace();
		}
	}
}
