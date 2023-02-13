package member_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import member.bo.membership_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class updatemembercontroller
 */
@WebServlet("/updatemembercontroller")
public class updatemembercontroller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	      
        PrintWriter pw=response.getWriter();
        
       
       int id=Integer.parseInt(request.getParameter("id")); 
        
       String name= request.getParameter("name");
       String email= request.getParameter("email");
       String contact_no= request.getParameter("contact_no");
       String loc= request.getParameter("loc");
       String doj= request.getParameter("doj");
       String pack= request.getParameter("pack");
       
       
    membership_bo eb=new  membership_bo();
         eb.setId(id);
         eb.setName(name);
         eb.setEmail(email);
         eb.setContact_no(contact_no);
         eb.setLoc(loc);
         eb.setDoj(doj);
         eb.setPack(pack);
        
         
       
      int status= member_dao1.update1(eb);
      
      if(status>0) {
    	   
    	  RequestDispatcher rd=request.getRequestDispatcher("addallmemberconroller");
    	    rd.forward(request, response);
    	    
      }



		
		
	}


}