package loginpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	
	
	UserBean ub=null;
	public UserBean login(String uname, String pwd)
	{
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from userreg63 where uname=? and pword=?");
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ub= new UserBean();
				ub.setUname(rs.getString(1));
				ub.setPwd(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setAddress(rs.getString(5));
				ub.setEmail(rs.getString(6));
				ub.setPhno(rs.getLong(7));
			}
			
		} catch (Exception e) {
			e.printStackTrace();		}
		return ub;
	}
	

}
