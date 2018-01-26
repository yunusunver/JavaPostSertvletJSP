	package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageOneProcess
 */
public class pageOneProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//html dosyas�ndan ald��� de�erleri de�i�kene at�yoruz.
		String name=request.getParameter("name");
		String add=request.getParameter("address");
		String phone=request.getParameter("phone");
		
		//consoleda yazd�r�yoruz.
		System.out.println("the name is"+name);
		System.out.println("the address is"+add);
		System.out.println("the phone is"+phone);
		
		//de�erlerimizi sessiona at�yoruz.
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("add", add);
		request.getSession().setAttribute("phone", phone);
		
		//sayfay� pageTwo'a y�nlendiriyoruz.
		response.sendRedirect("html/pageTwo.html");
	}

}
