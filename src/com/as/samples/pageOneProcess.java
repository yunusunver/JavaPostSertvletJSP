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
		
		//html dosyasýndan aldýðý deðerleri deðiþkene atýyoruz.
		String name=request.getParameter("name");
		String add=request.getParameter("address");
		String phone=request.getParameter("phone");
		
		//consoleda yazdýrýyoruz.
		System.out.println("the name is"+name);
		System.out.println("the address is"+add);
		System.out.println("the phone is"+phone);
		
		//deðerlerimizi sessiona atýyoruz.
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("add", add);
		request.getSession().setAttribute("phone", phone);
		
		//sayfayý pageTwo'a yönlendiriyoruz.
		response.sendRedirect("html/pageTwo.html");
	}

}
