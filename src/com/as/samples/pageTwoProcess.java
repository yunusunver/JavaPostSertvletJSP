package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageTwoProcess
 */
public class pageTwoProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//html sayfas�ndan gelen de�erleri de�i�kene at�yoruz
		String id=request.getParameter("id");
		String course=request.getParameter("course");
		
		//de�erleri console ekran�nda yazd�r�yoruz
		System.out.println("The id is"+id);
		System.out.println("The course is"+course);
		
		//de�erleri sessiona at�yoruz.
		request.getSession().setAttribute("id", id);
		request.getSession().setAttribute("course", course);
		
		//jsp dosyas�na y�nlendiriyoruz.
		response.sendRedirect("jsp/printout.jsp");
	}

}
