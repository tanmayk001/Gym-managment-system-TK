package member_controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import member.bo.enquiry_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class addallenquiryconroller
 */
@WebServlet("/addallenquiryconroller")
public class addallenquiryconroller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method 
          response.setContentType("text/html");
		
		 PrintWriter ps=response.getWriter();
		 
		 ps.print("<link rel='stylesheet' href='css/table.css'>");
	     
	     ps.print("<a href='home.html'>back</a>");
	     
	     
	     ps.print("<table border='1px' width= '100%'>");
	     
	     
	     ps.print("<tr> <th>id </th> <th>first_name</th> <th>last_name </th> <th>current weight</th> <th>bmi </th>  <th>age </th> <th>goal_weight</th> <th>email </th><th>edit</th><th>delete</th></tr>");
	     
	      List<enquiry_bo> list=member_dao1.getallemployee();
	      
	      
	      for( enquiry_bo eb: list)
	      {
	    	   ps.print("<tr><td>"+eb.getId()+"</td><td>"+eb.getFirst_name()+"</td><td>"+eb.getLast_name()+"</td><td>"+eb.getCurrent_weight()+"</td><td>"+eb.getBmi()+"</td><td>"+eb.getAge()+"</td> <td>"+eb.getGoal_weight()+"</td>  <td>"+eb.getEmail()+"</td><td>"
	    			   +"<a href='editservletenquirycontroler?id="+eb.getId()+"'> edit </a></td> <td><a href='deleteenquirycontroller?id="+eb.getId()+"'>delete </a></td></tr>"); 
	      }
	      
	     ps.print("</table>"); 
}

	}


