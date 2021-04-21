package com.j4ltechnologies.formation.javaee.filters; /**
 * Classe ConverterFilter, créée le 21/04/2021 à 16:55
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */

import com.j4ltechnologies.formation.javaee.models.User;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "ConverterFilter",urlPatterns = "/converter")
public class ConverterFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("Je suis dans le filtre converter");

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        User user = (User) req.getSession().getAttribute("user");

        if(user == null) {
            res.sendRedirect("login");
        }else {
            chain.doFilter(request, response);
        }
    }
}
