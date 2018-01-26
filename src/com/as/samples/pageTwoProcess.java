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
		
		//html sayfasýndan gelen deðerleri deðiþkene atýyoruz
		String id=request.getParameter("id");
		String course=request.getParameter("course");
		
		//deðerleri console ekranýnda yazdýrýyoruz
		System.out.println("The id is"+id);
		System.out.println("The course is"+course);
		
		//deðerleri sessiona atýyoruz.
		request.getSession().setAttribute("id", id);
		request.getSession().setAttribute("course", course);
		
		//jsp dosyasýna yönlendiriyoruz.
		response.sendRedirect("jsp/printout.jsp");
	}

}
