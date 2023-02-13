package member_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import member.bo.enquiry_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class updateenquirycontroller
 */
@WebServlet("/updateenquirycontroller")
public class updateenquirycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateenquirycontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	      
        PrintWriter pw=response.getWriter();
        
       
       int id=Integer.parseInt(request.getParameter("id")); 
        
       String first_name= request.getParameter("first_name");
       String last_name= request.getParameter("last_name");
       String current_weight= request.getParameter("current_weight");
       String Bmi= request.getParameter("Bmi");
       String Age= request.getParameter("Age");
       String Goal_weight= request.getParameter("Goal_weight");
       String email= request.getParameter("email");
       
enquiry_bo eb=new enquiry_bo();
         eb.setId(id);
         eb.setFirst_name(first_name);
         eb.setLast_name(last_name);
         eb.setCurrent_weight(current_weight);
         eb.setBmi(Bmi);
         eb.setAge(Age);
         eb.setGoal_weight(Goal_weight);
         eb.setEmail(email);
         
       
      int status= member_dao1.update(eb);
      
      if(status>0) {
    	   
    	  RequestDispatcher rd=request.getRequestDispatcher("addallenquiryconroller");
    	    rd.forward(request, response);
    	    
      }response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
