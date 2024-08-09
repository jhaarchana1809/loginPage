package loginpage;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] c = req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else
		{
			String fn= c[0].getValue();
			ServletContext sct=req.getServletContext();
			UserBean ub=(UserBean)sct.getAttribute("ubean");
			ub.setAddress(req.getParameter("address"));
			ub.setEmail(req.getParameter("email"));
			ub.setPhno(Long.parseLong(req.getParameter("phno")));
			int k=new UpdateProfileDao().updateProfile(ub);
			if(k>0)
			{
				req.setAttribute("fname", fn);
				req.setAttribute("msg", "Profile updated successfully...");
				req.getRequestDispatcher("updateProfile.jsp").forward(req, resp);
			}
			
		}
	}

}
