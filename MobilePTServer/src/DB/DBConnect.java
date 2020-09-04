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
	
	public DBConnect () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilePT?useSSL=false","root","1234");
			st = con.createStatement();
		}catch(Exception e) {
			System.out.println("(ERROR)DB.DBConnection: ");
			e.printStackTrace();
		}
	}
}
