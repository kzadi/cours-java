package com.j4ltechnologies.formation.javaee.servlets;

import com.j4ltechnologies.formation.javaee.models.User;

import java.io.IOException;
import java.io.Serial;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Serial
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");

		if(email.equalsIgnoreCase("stagiaire@aston.fr") && mdp.equals("Password147")) {
			//Il est conduit sur la page de conversion
			
			User user = new User(email, mdp);
			
			//On recupere la session de navigation
			HttpSession session = request.getSession();

			//On met le User dans la session	
			session.setAttribute("user", user);
			
			response.sendRedirect("converter");
		}else {
			//Il reconduit sur la page de login
			String message = "Utilisateur inconnue du syteme";
			request.setAttribute("msgError", message);
			
			//doGet(request, response);
			response.sendRedirect("login");
		}
	}
}
