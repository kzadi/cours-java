package com.j4ltechnologies.formation.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Classe PremiereServlet, créée le 21/04/2021 à 16:20
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class PremiereServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Init de la servlet " + getClass().getSimpleName());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet de la classe " + getClass().getSimpleName());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost de la classe " + getClass().getSimpleName());
    }

    @Override
    public void destroy() {
        System.out.println("Avant destruction de la servlet " + getClass().getSimpleName());
    }
}

/*
 * Une servlet est une classe Java qui etend la classe HttpServlet
 *
 * Par convention, un projet web en Java EE doit contenir un fichier web.xml
 * Le web.xml soit imperativement se trouver dans le dossier WEB-INF
 */