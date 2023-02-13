package member_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import member.bo.membership_bo;
import member_dao.member_dao1;

/**
 * Servlet implementation class editservletmembercontroller
 */
@WebServlet("/editservletmembercontroller")
public class editservletmembercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editservletmembercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		 
	      String id=request.getParameter("id");
        
	      int eid= Integer.parseInt(id);
	    
	      membership_bo eb= member_dao1.getmembers(eid);
	    
	      pw.print("<link rel='stylesheet' href='css/table.css'>");
		     
		 
		pw.print("<form  action='updatemembercontroller' method='get'> ");
	    
		pw.print("<table >");
		
		pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+eb.getId()+"'/></td></tr>");  
		pw.print("<tr><td>Name: </td> <td><input type='text' name='name' value='"+eb.getName()+"'/></td></tr>");
	   	pw.print("<tr><td>Email: </td> <td><input type='email' name='email' value='"+eb.getEmail()+"'/></td></tr>");
	   	pw.print("<tr><td>Phone:</td> <td><input type='text'name='contact_no' value='"+eb.getContact_no()+"'/></td></tr>");
	   	pw.print("<tr><td>Date of Joining : </td> <td><input type='date' name='loc' value='"+eb.getLoc()+"'/></td></tr>");
	   	pw.print("<tr><td>Date of Birth: </td> <td><input type='text' name='doj' value='"+eb.getDoj()+"'/></td></tr>");
	   	pw.print("<tr><td>Adhar Card: </td> <td><input type='text'   name='pack' value='"+eb.getPack()+"'/></td></tr>");
		
	    pw.print("<tr><td><input type='submit' value='update '/></td></tr>"); 
	    
	   	pw.print("</table>");
		
		pw.print("</form>");
	}

}

