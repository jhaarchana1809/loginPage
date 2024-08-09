package loginpage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRegisterDao {
		
	int k=0;
	public int insert(UserBean ub)
	{
		try {
			
			Connection con=DBConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("insert into userreg63 values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPwd());
			ps.setString(3, ub.getFname());
			ps.setString(4, ub.getLname());
			ps.setString(5, ub.getAddress());
			ps.setString(6, ub.getEmail());
			ps.setLong(7, ub.getPhno());
			
			k=ps.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return k;
	}

}
