package member_controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import member.bo.enquiry_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class enquirycontroller
 */
@WebServlet("/enquirycontroller")
public class enquirycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public enquirycontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	              response.setContentType("text/html");
	              PrintWriter pw=response.getWriter();
		 String first_name=request.getParameter("first-name");
		 String last_name=request.getParameter("last-name");
		 String current_weight=request.getParameter("current-weight");
          String bmi=request.getParameter("bmi");
		   String age=request.getParameter("age");
		   String goal_weight=request.getParameter("goal-weight");
		    String email=request.getParameter("email");
		
		           
		          enquiry_bo em=new enquiry_bo(first_name,last_name, current_weight, bmi,age, goal_weight, email);
		          
		          em.setFirst_name(first_name);
		          em.setLast_name(last_name);
		          em.setCurrent_weight(current_weight);
		          em.setBmi(bmi);
		          em.setAge(age);
		          em.setGoal_weight(goal_weight);
		          em.setEmail(email);
		          
		          
		          
		          int status= member_dao1.addenquiry(em);
			        
			         if(status>0)
			         {
			        	  pw.print("successfully added");
			        	  RequestDispatcher rd=request.getRequestDispatcher("addallenquiryconroller");
			            	 rd.forward(request, response);
			         }
			         else
			         {
			        	 pw.print("something went wrong "); 
			        	  RequestDispatcher rd=request.getRequestDispatcher("home.html");
			              rd.include(request, response);
			        	 
			         }
		          
		          
		           
		
		
	}

}
