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
import member.bo.membership_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class addallmemberconroller
 */
@WebServlet("/addallmemberconroller")
public class addallmemberconroller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");   
		
		
		PrintWriter ps=response.getWriter();
		
		 ps.print("<link rel='stylesheet' href='css/table.css'>");
	     
	     ps.print("<a href='home.html'>back</a>");
	     
	     
	     ps.print("<table border='1px' width= '100%'>");
	     
	     
	     ps.print("<tr> <th>id </th> <th>name</th> <th>email </th> <th>contact_no</th> <th>loc </th> <th>doj</th> <th>pack</th>  <th>edit</th> <th>delete</th> </tr>");
	     
	      List<membership_bo> list=member_dao1.getallmembers1();
	      
	      
	      for( membership_bo eb: list)
	      {
	    	   ps.print("<tr><td>"+eb.getId()+"</td><td>"+eb.getName()+"</td><td>"+eb.getEmail()+"</td><td>"+eb.getContact_no()+"</td><td>"+eb.getLoc()+"</td><td>"+eb.getDoj()+"</td> <td>"+eb.getPack()+"</td><td>"
	    	+"<a href='editservletmembercontroller?id="+eb.getId()+"'> edit </a></td> <td><a href='deletemembercontroller?id="+eb.getId()+"'>delete </a></td></tr>"); 
	      }
	      
	     ps.print("</table>"); 
}

		
		
		
		
		
		
	}


