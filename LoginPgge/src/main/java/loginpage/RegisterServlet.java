package loginpage;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
	UserBean ub= new UserBean();
	ub.setUname(req.getParameter("uname"));
	ub.setPwd(req.getParameter("pwd"));
	ub.setFname(req.getParameter("fname"));
	ub.setLname(req.getParameter("lname"));
	ub.setEmail(req.getParameter("email"));
	ub.setPhno(Long.parseLong(req.getParameter("phno")));
	ub.setAddress(req.getParameter("address"));
	
	UserRegisterDao urd= new UserRegisterDao();
	int k = urd.insert(ub);
	if(k>0)
	{
		req.setAttribute("msg", "User Registration Successfully!!");
		RequestDispatcher rd= req.getRequestDispatcher("register.jsp");
		rd.forward(req, resp);
		
	}
	
	
	}

}
