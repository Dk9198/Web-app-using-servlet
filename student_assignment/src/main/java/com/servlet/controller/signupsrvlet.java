package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.student_dao;
import com.servlet.dto.Student;

@WebServlet("/signup")
public class signupsrvlet extends HttpServlet {
	
	@Override
	protected  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("sname");
		long phone= Long.parseLong(req.getParameter("sphone"));
		
		String address = req.getParameter("saddress");
		String email = req.getParameter("semail");

		String password =req.getParameter("spassword");
		
		Student s = new Student();
		s.setName(name);
		s.setPhone(phone);
		s.setEmail(email);
		s.setPassword(password);
		s.setAddress(address);
		
		student_dao.saveStudent(s);
		
	

		String html = "<html><body>Registered Successfully</body></html>";
	
		
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.forward(req, resp);
		
	}
	
	
}
