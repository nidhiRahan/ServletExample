package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Stuser
 */
@WebServlet("/Stuser")
public class Stuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Stuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   PrintWriter out = response.getWriter();
		   String rno = request.getParameter("txtrno");
		   String name = request.getParameter("txtname");
		   String gen = request.getParameter("gender");
		   String course[] = request.getParameterValues("course");
		   String c = "";
		   for(String d:course)
		   {
			   c = c + d + " ";
		   }
		   String location = request.getParameter("location");
		   String ct[] = request.getParameterValues("ctype");
		   String ct1 = "";
		   for(String d:ct)
		   {
			   ct1 = ct1 + d + " ";
		   }
		   String query = request.getParameter("query");
		   out.print("rno is "+rno + " name is "+ name + " gender is "+ gen + " courses are "+ct1 + "Query is "+query);
	}

}
