package loginpage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDao {
	
	
	public int k=0;
	
	public int updateProfile(UserBean ub)
	{
		try {
			
			Connection con=DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("update userreg63 set addr=?, mid=?, phno=? where uname=? and pword=?");
			ps.setString(1, ub.getAddress());
			ps.setString(2, ub.getEmail());
			ps.setLong(3, ub.getPhno());
			ps.setString(4, ub.getUname());
			ps.setString(5, ub.getPwd());
			
			k=ps.executeUpdate();
			
			
		} catch (Exception e) {
			
		e.printStackTrace();
		
		}
		return k;
	}

}
