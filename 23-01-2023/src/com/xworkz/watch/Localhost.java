package com.xworkz.watch;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(loadOnStartup=6,urlPatterns="/localhost")
public class Localhost extends HttpServlet{

	public Localhost(){
		System.out.println("created" +this.getClass().getSimpleName());
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created Localhost");
}
}