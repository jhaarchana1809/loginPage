package loginpage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
public static Connection con=null;

public DBConnection() {
	}
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "archana","archana");
			
			
		} catch (Exception e) {
			e.printStackTrace();		}
	}
	
	
	public static Connection getConnection()
	{
		return con;
	}
	
}
