package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBconnection.connectionDb;
import beans.person;
import dao.signupDAO;


@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String fname  = request.getParameter("fname");
			String lname  = request.getParameter("lname");
			int age  = Integer.parseInt(request.getParameter("age"));
			String phone  = request.getParameter("phone");
			String email = request.getParameter("email");
			PrintWriter out = response.getWriter();
			out.print(fname+" "+lname+" "+age+" "+phone);
			person obj = new person();
			obj.setFname(fname); obj.setLname(lname); obj.setPhone(phone); obj.setAge(age);obj.setEmail(email);
			boolean ans  =  signupDAO.authentication(obj);
			if(ans == true)
			{
				HttpSession session = request.getSession();
				session.setAttribute("per", obj);
				response.sendRedirect("welcome.jsp");
			}
			else
			{
				response.sendRedirect("signup.jsp");
			}
			
	}

}
