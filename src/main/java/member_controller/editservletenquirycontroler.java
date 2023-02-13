package member_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import member.bo.enquiry_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class editservletenquirycontroler
 */
@WebServlet("/editservletenquirycontroler")
public class editservletenquirycontroler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editservletenquirycontroler() {
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
		
		
		 
	      String id=request.getParameter("id");
         
	      int eid= Integer.parseInt(id);
	    
	      enquiry_bo eb= member_dao1.getemployee(eid);
	    
	      pw.print("<link rel='stylesheet' href='css/table.css'>");
		 
		pw.print("<form  action='updateenquirycontroller' method='get'> ");
	    
		pw.print("<table>");
		
		pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+eb.getId()+"'/></td></tr>");  
		pw.print("<tr><td>first_name: </td> <td><input type='text' name='first_name' value='"+eb.getFirst_name()+"'/></td></tr>");
	   	pw.print("<tr><td>last_name: </td> <td><input type='text' name='last_name' value='"+eb.getLast_name()+"'/></td></tr>");
	   	pw.print("<tr><td>current_weight:</td> <td><input type='text'name='current_weight' value='"+eb.getCurrent_weight()+"'/></td></tr>");
	   	pw.print("<tr><td> Bmi: </td> <td><input type='date' name='Bmi' value='"+eb.getBmi()+"'/></td></tr>");
	   	pw.print("<tr><td>Age: </td> <td><input type='date' name='Age' value='"+eb.getAge()+"'/></td></tr>");
	   	pw.print("<tr><td>Goal_weight: </td> <td><input type='text'  name='Goal_weight' value='"+eb.getGoal_weight()+"'/></td></tr>");
		pw.print("<tr><td>email: </td> <td><input type='email'  name='email' value='"+eb.getEmail()+"'/></td></tr>");
		
	    pw.print("<tr><td><input type='submit' value='update '/></td></tr>"); 
	    
	   	pw.print("</table>");
		
		pw.print("</form>");
	}

}
