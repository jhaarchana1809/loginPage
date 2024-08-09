package loginpage;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] c = req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session Expired...");
					}
		else
		{
			String fn = c[0].getValue();
			
			
			ServletContext sct = req.getServletContext();
			sct.removeAttribute("ubean");
			c[0].setMaxAge(0);
			resp.addCookie(c[0]);
			req.setAttribute("msg", "Logout Successfully....");
		}
		req.getRequestDispatcher("msg.jsp").forward(req, resp);

	
	}
	
	

}
