package buddha;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;

@WebServlet("/login")
public class demoservlet extends HttpServlet{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{
        RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
        dispatcher.forward(req, res);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException{
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        System.out.println("username " + username);
        System.out.println("password " + password);
        
        // login logic 
        
        PrintWriter writer = res.getWriter();
        writer.print("login successful");
        writer.close();
    }
}