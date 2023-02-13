package member_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.bo.member_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class Logincontroller
 */
@WebServlet("/Logincontroller")
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		     response.setContentType("text/html");
		
		 PrintWriter pw=response.getWriter();
		 
		 
		        String name=request.getParameter("name");
		        String  pass=request.getParameter("pass");
		        
		        
		        
		          if(member_dao1.login(name, pass))
		          {
		        	  pw.print("successfully.login");
		        	      RequestDispatcher res = request.getRequestDispatcher("home.html");
		        	      res.forward(request, response);
		          }
		          else
		          {
		        	  pw.print("something went wrong");
		        	  RequestDispatcher res = request.getRequestDispatcher("home.html");
	        	      res.include(request, response);
		          }
		    
		
		
		
		
		
	}
	

}
