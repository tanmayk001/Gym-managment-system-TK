package member_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member_dao.member_dao1;

/**
 * Servlet implementation class deleteenquirycontroller
 */
@WebServlet("/deleteenquirycontroller")
public class deleteenquirycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteenquirycontroller() {
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
         
          member_dao1.delete1(id);
          
          response.sendRedirect("addallmemberconroller");
	}

}
