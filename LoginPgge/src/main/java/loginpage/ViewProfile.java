package loginpage;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewProfile extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c[]=req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session has been expired...");
			RequestDispatcher rd=req.getRequestDispatcher("msg.jsp");
			rd.forward(req, resp);
		}
		else
		{
			
			String fn=c[0].getValue();
			req.setAttribute("fname", fn);
			RequestDispatcher rd=req.getRequestDispatcher("viewProfile.jsp");
			rd.forward(req, resp);
		}
	}
}
