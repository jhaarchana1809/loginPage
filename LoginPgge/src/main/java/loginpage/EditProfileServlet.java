package loginpage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	Cookie c[]=req.getCookies();
	if(c==null)
	{
		req.setAttribute("msg", "Session Expired...<br>");
		req.getRequestDispatcher("msg.jsp").forward(req, resp);
	}
	else
	{
		String fn = c[0].getValue();
		req.setAttribute("fname", fn);
		req.getRequestDispatcher("editProfile.jsp").forward(req, resp);
	}
	
	
	}

}
