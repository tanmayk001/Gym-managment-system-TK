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
 * Servlet implementation class signupcontroller
 */
@WebServlet("/signupcontroller")
public class signupcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		     response.setContentType("text/html");
		      
		     PrintWriter pw=response.getWriter();
		     
		     
		       String name=request.getParameter("name");
		       String pass=request.getParameter("pass");
		       String email=request.getParameter("email");
		       String phone=request.getParameter("phone");
		       
		       
		       // pw.print(name+" "+pass+" "+email+" "+phone);
		       member_bo em=new member_bo();
		       
		       
		       em.setName(name);
		       em.setPassword(pass);
		       em.setEmail(email);
		       em.setPhone(phone);
		       
		       int status=member_dao1.signup(em);
		       
		        if(status>0)
		        {
		           RequestDispatcher req=request.getRequestDispatcher("login.html");
		           req.forward(request, response);
		           
		        }
		        else
		        {
		        	   RequestDispatcher req=request.getRequestDispatcher("signup.html");
			           req.include(request, response);
		        }
		       
		       
		       
		     
	}

}
