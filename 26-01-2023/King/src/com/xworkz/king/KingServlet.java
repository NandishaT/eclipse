package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/king")
public class KingServlet extends HttpServlet{
	
	public KingServlet() {
		System.out.println("KingServlet Created");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//King: name,region,noOfQueens,Dob,Dod
		
		System.out.println("King database");
		
		String name=req.getParameter("Name");
		String region=req.getParameter("Region");
		String noOfQueens=req.getParameter("noOfQueens");
		String dob=req.getParameter("dob");
		String dod=req.getParameter("dod");
		
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		
		System.out.println("Name: "+name);
		System.out.println("Region: "+region);
		System.out.println("noOfQueens: "+noOfQueens);
		System.out.println("dob: "+dob);
		System.out.println("dod: "+dod);
		
		String htmlRespone = "<html>";
        htmlRespone += "<h2>The DataBase of " + name + " is sent successfull!</h2>";      
        //htmlRespone += "Your password is: " + password + "";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);	
	}
	@Override
	public void destroy() {
		System.out.println("Data of King is sent");
	}

}
