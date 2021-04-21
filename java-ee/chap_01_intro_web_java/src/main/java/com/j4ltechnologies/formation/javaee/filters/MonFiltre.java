package com.j4ltechnologies.formation.javaee.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * Classe MonFiltre, créée le 21/04/2021 à 16:28
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class MonFiltre implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init du filtre --> Appelée en 1er ");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("doFilter du filtre --> Appelée en Xeme ");

        //Dans le doFilter, on fait les verifies de droit d'acces.
        //if(autorisation){
        //	on laisse passer la requete avec l'obje chain --> chain.doFilter(request, response);
        //}else{
        // 	Je redirige le user vers une autre destination par defaut
        //}
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy du filtre --> Appelée en en dernier");
    }
}
