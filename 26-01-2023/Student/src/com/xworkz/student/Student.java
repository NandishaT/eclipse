package com.xworkz.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/student")
public class Student extends HttpServlet{
	
	public Student() {
		System.out.println("Student Created");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Data of Student");
		
		String name=req.getParameter("Name");
		String college=req.getParameter("College");
		String nation=req.getParameter("nation");
		String state=req.getParameter("state");
		String city=req.getParameter("city");
		String gender=req.getParameter("gender");
		String dept=req.getParameter("dept");
		String id=req.getParameter("id");
		String phno=req.getParameter("phno");
		String usn=req.getParameter("usn");
		String laptopname=req.getParameter("laptopname");
		String laptopcore=req.getParameter("laptopcore");
		String capacity=req.getParameter("capacity");
		String libid=req.getParameter("libid");
		String doj=req.getParameter("doj");
		String doe=req.getParameter("doe");
		String project=req.getParameter("project");
		String adhar=req.getParameter("adhar");
	    String pan=req.getParameter("pan");
	    String address=req.getParameter("address");
	    String email=req.getParameter("email");
	    
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		
		System.out.println("Name: "+name);
	    System.out.println("College: "+college);
	    System.out.println("Nation: "+nation);
	    System.out.println("State: "+state);
	    System.out.println("city: "+city);
	    System.out.println("gender: "+gender);
	    System.out.println("dept: "+dept);
	    System.out.println("id: "+id);
	    System.out.println("phno: "+phno);
	    System.out.println("usn: "+usn);
	    System.out.println("laptopname: "+laptopname);
	    System.out.println("laptopcore: "+laptopcore);
	    System.out.println("capacity: "+capacity);
	    System.out.println("libid: "+libid);
	    System.out.println("doj: "+doj);
	    System.out.println("doe: "+doe);
	    System.out.println("adhar: "+adhar);
	    System.out.println("pan: "+pan);
	    System.out.println("address: "+address);
	    System.out.println("email: "+email);
	    
	    
		
		
		String htmlRespone = "<html>";
        htmlRespone += "<h2>The DataBase of " + name + " is sent successfull!</h2>";      
   
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);	
	}

}
