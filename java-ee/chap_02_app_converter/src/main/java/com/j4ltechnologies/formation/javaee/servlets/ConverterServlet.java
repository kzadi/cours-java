package com.j4ltechnologies.formation.javaee.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/converter")
public class ConverterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/pages/converter.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Je recupere la valeur saisie en celsius
		String celsius = request.getParameter("celsius");

		try {
			double celsiusDouble = Double.parseDouble(celsius);
			double fahrenheit = 1.8 * celsiusDouble + 32;

			BigDecimal resultat = BigDecimal.valueOf(fahrenheit);
			resultat = resultat.setScale(2, RoundingMode.HALF_UP);

			request.setAttribute("resultat", resultat);
			// doGet(request, response);
		} catch (NumberFormatException e) {
			String msgError = "Erreur de saisie";
			request.setAttribute("error", msgError);
			// doGet(request, response);
		} finally {
			doGet(request, response);
		}
	}
}