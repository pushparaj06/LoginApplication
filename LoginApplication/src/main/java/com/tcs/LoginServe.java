package com.tcs;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServe
 */
public class LoginServe extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// general Seetings
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		// Get the Requested Data

		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		// Request Processing Logic
		
		/*
		 * if(username.equalsIgnoreCase("Rishi") && password.equals("Raj")) {
		 * pw.println("Login Sucessfull Mr."+username); } else {
		 * pw.println("Login Failed"); }
		 */
		 

		/*
		 * if(username.equalsIgnoreCase("Rishi") && password.equals("Raj")) {
		 * response.sendRedirect("https://www.youtube.com/");
		 * 
		 * } else { response.sendError(808, "Login Failed Please Enter Valid Details");
		 * }
		 */
		
		
		/*
		 * if(username.equalsIgnoreCase("Rishi") && password.equals("Raj")) {
		 * 
		 * RequestDispatcher rd=request.getRequestDispatcher("sucess.html");
		 * rd.forward(request, response);
		 * 
		 * } else { RequestDispatcher rd=request.getRequestDispatcher("fail.html");
		 * rd.forward(request, response); }
		 */
		 
		
		
		/*
		 * if(username.equalsIgnoreCase("Rishi") && password.equals("Raj")) {
		 * 
		 * pw.
		 * println("<a href='https://www.youtube.com'>Click here to get Sucess Information</a>"
		 * );
		 * 
		 * } else {
		 * pw.println("<a href='FailServlet'>Click here to get failure Information</a>"
		 * ); }
		 */
		

		  if(username.equalsIgnoreCase("Rishi") && password.equals("Raj")) 
		  {
			  pw.println("This is Sucess");
			  pw.print("That is Sucess"); 
		   RequestDispatcher rd=request.getRequestDispatcher("SucessServlet");
		   rd.forward(request, response);
		  
		  } else
		  {
			  pw.println("This is Fail<br>");
			  pw.println("That is Fail<br>"); 
			  pw.println("Enter Valid Details<br>");
			  
			  RequestDispatcher rd=request.getRequestDispatcher("login.html");
			  
		  rd.include(request, response); 
		  pw.println("you want to Login Again vrooo");
		  
		  }
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
		

	}

}
