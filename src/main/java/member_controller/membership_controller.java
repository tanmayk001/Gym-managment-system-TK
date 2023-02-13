package member_controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import member.bo.membership_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class membership_controller
 */
@WebServlet("/membership_controller")
public class membership_controller extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		 response.setContentType("text/html");
		   
		    PrintWriter pw=response.getWriter();
		    
		       Connection con=member_dao1.getConnection();
		     
		       
		        String name=request.getParameter("name");
		        String email=request.getParameter("email");
		        String contact_no=request.getParameter("contact_no");
		        String loc=request.getParameter("loc");
		         String doj=request.getParameter("doj");
		        String pack=request.getParameter("pack");
		        
		        
		        
		        membership_bo em=new membership_bo(name,email,contact_no,loc, doj, pack);
		        
		        
		        
		        em.setName(name);
		          em.setEmail(email);
		          em.setContact_no(contact_no);
		          em.setLoc(loc);
		          em.setDoj(doj);
		          em.setPack(pack);
		         
		        
		        
		      pw.print(name+" "+email+" "+ contact_no+" "+loc+" "+doj+" "+ pack);
		        
		        int status= member_dao1.addmembers1(em);
		        
		         if(status>0)
		         {
		        	  pw.print("successfully added");
		        	  RequestDispatcher rd=request.getRequestDispatcher("addallmemberconroller");
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


