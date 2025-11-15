package com.nt.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		Date d=new Date();
		
		pw.println("<h1> the date is "+d+"</h1>");
		System.out.println("welcome");
		
		pw.println("<a href='index.jsp'>Home</a>");
		pw.close();
		//new change
    }


}
