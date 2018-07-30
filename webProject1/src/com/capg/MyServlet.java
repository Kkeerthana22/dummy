package com.capg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	//response.getWriter();
	PrintWriter out = response.getWriter();
	
	out.print("welcome to servlet<br>");
	out.println("keerthana");
	out.println("<body bgcolor = red> it's red </body>");
	out.println(request.getRemotePort());
	out.println(request.getServerPort());
	out.println(request.getServerName());
   String uname = request.getParameter("uname");
   String pwd = request.getParameter("pwd");
   out.print("<br>username="+uname);
   out.print("<br>pwd="+pwd);
   String Gender=request.getParameter("gender");
   out.print("<br>gender=" +Gender);
   
   Enumeration<String> en = request.getParameterNames();
	
	 while (en.hasMoreElements())
	 {
		 String param = en.nextElement();
		 out.println(request.getParameter(param));
	 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
