package loginpage;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDao ud= new UserDao();
		UserBean login = ud.login(req.getParameter("uname"), req.getParameter("pwd"));
		if(login==null)
		{
			req.setAttribute("msg", "Invalid Login process...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, resp);
		}
		else
		{
			req.setAttribute("msg", "Login Successfully...");
			ServletContext sct=req.getServletContext();
			sct.setAttribute("ubean", login);
			Cookie c= new Cookie("fname", login.getFname());
			resp.addCookie(c);
			RequestDispatcher rd= req.getRequestDispatcher("loginSuccess.jsp");
			rd.forward(req, resp);
			
		}
		
		
	}

}
