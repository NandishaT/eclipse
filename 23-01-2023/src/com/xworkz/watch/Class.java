package com.xworkz.watch;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(loadOnStartup=7,urlPatterns="/class")
public class Class extends HttpServlet{

	public Class(){
		System.out.println("created" +this.getClass().getSimpleName());
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created Class");
}
}