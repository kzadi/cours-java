package com.j4ltechnologies.formation.javaee.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j4ltechnologies.formation.javaee.dao.IEmployeDao;
import com.j4ltechnologies.formation.javaee.dao.impl.EmployeDao;

@WebServlet("/liste")
public class ListeEmployeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private IEmployeDao dao;

	@Override
	public void init() throws ServletException {
		try {
			dao = new EmployeDao();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setAttribute("employes", dao.getEmployes());
		} catch (Exception e) {
			String msgErreur = "Impossible de charger la liste des employés";
			request.setAttribute("error", msgErreur);
		} finally {
			request.getRequestDispatcher("/WEB-INF/jsp/liste.jsp").forward(request, response);
		}
	}
}