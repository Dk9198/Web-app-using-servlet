package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.student_dao;
import com.servlet.dto.Student;


@WebServlet("/login")
public  class loginservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("semail");
		String password = req.getParameter("spassword");
		
		student_dao sd = new student_dao();
		
		Student s = sd.getStudent(email,password);
		
		
		if(s!=null) {
			RequestDispatcher rd = req.getRequestDispatcher("homepage.html");
			rd.forward(req, resp);
	
		}
		else {
		
//		String html= "<html><body><h1>Invalid data</h1></body></html>";
		req.setAttribute("logged","no");
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req, resp);
		
		
		}
	}
	
}
