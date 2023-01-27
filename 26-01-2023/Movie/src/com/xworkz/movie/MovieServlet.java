package com.xworkz.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/myshow")
public class MovieServlet extends HttpServlet{
	
	public MovieServlet() {
		System.out.println("Running MovieServlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("movie database");
		
		String name=req.getParameter("Name");
		String lang=req.getParameter("Language");
		String noOfEpi=req.getParameter("noOfEpi");
		String ott=req.getParameter("ott");
		String budget=req.getParameter("Budget");
		
		resp.setContentType("text/html");
		PrintWriter printwriter=resp.getWriter();
		/*printwriter.print("<html>");
		printwriter.print("<body>");
		printwriter.print("<span>");*/
		//printwriter.print("<h1>Movie Database</h1>");
		/*printwriter.print("Name: "+name);
		printwriter.print("lang: "+lang);
		printwriter.print("NoOfEpi: "+noOfEpi);
		printwriter.print("OTT: "+ott);
		printwriter.print("Budget: "+budget);*/
		/*printwriter.print("</span>");
		printwriter.print("</body>");
		printwriter.print("</html>");
		printwriter.close();*/
		
		System.out.println("Name: "+name);
		System.out.println("Lang: "+lang);
		System.out.println("noOfEpi: "+noOfEpi);
		System.out.println("ott: "+ott);
		System.out.println("Budget: "+budget);
		
		
		String htmlRespone = "<html>";
        htmlRespone += "<h2>The DataBase of " + name + " is sent successfull!</h2>";      
        //htmlRespone += "Your password is: " + password + "";    
        htmlRespone += "</html>";
         
        // return response
        printwriter.println(htmlRespone);
        
       
        	
        
	}
	@Override
	public void destroy() {
		System.out.println("Data of movie is sent");
	}

}


