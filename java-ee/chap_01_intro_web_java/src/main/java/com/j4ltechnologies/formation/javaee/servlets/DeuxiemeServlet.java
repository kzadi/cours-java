package com.j4ltechnologies.formation.javaee.servlets; /**
 * Classe ${NAME}, créée le 21/04/2021 à 16:26
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet(name = "DeuxiemeServlet", value = "/deux")
public class DeuxiemeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet de la classe " + getClass().getSimpleName());

        String message = "Un petit bonjour depuis la servlet";
        request.setAttribute("msg", message);

        LocalTime heure = LocalTime.now();
        request.setAttribute("heure", heure);

        String prenom = request.getParameter("prenom");
        System.out.println(prenom);

        request.setAttribute("login", prenom);

        request.getRequestDispatcher("/premiere.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("doPost de la classe " + getClass().getSimpleName());
    }
}