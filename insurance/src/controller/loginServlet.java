package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.person;
import dao.loginDAO;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			int id = Integer.parseInt(request.getParameter("id"));
			String email = request.getParameter("email");
			
			person obj = new person();
			obj.setId(id); obj.setEmail(email);
			boolean ans  =  loginDAO.authentication(obj);
			if(ans  == true)
			{
				HttpSession session = request.getSession();
				session.setAttribute("per", obj);
				response.sendRedirect("welcome.jsp");
			}
			else
			{
				response.sendRedirect("login.jsp");
			}
		}

}
