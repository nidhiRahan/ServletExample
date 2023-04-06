package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SISer
 */
@WebServlet("/SISer")
public class SISer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SISer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<form action='' method='post'>");
		out.print("<input type='text' name='txtnum1' placeholder='Enter P' /> <br><br>");
		out.print("<input type='text' name='txtnum2' placeholder='Enter R' /> <br><br>");
		out.print("<input type='text' name='txtnum3' placeholder='Enter T' /> <br><br>");
		out.print("<input type='submit' name='btnsubmit' value='click' /> <br>");
		out.print("</form>");
		
		if(request.getParameter("q")!=null)
		{
			out.print("Result is "+request.getParameter("q"));
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		float a = Float.parseFloat(request.getParameter("txtnum1"));
		float b = Float.parseFloat(request.getParameter("txtnum2"));
		float c = Float.parseFloat(request.getParameter("txtnum3"));
		float si = (a*b*c)/100;
		response.sendRedirect("SISer?q="+si);
		//out.print("Result is "+c);
	}

}
