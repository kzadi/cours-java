package com.j4ltechnologies.formation.javase.classes.test;

import com.j4ltechnologies.formation.javase.classes.Compte;
import com.j4ltechnologies.formation.javase.classes.Personne;

import java.time.LocalDate;

/**
 * Classe Lanceur, créée le 19/04/2021 à 19:58
 *
 * @author Joachim Zadi
 * @version 1.0 du 19/04/2021
 */
public class Lanceur {
    public static void main(String[] args) {
/*// Declaration d'une de type primitif
        int a, b;

        a = 2;
        b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = -5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
*/
        //Acces au numero de compte_1
        /*String n_1 = compte_1.numero;
        double s_1 = compte_1.solde;
        System.out.printf("n_1 = %s, s_1 = %.2f%n", n_1, s_1);

        //Acces au numero de compte_1
        String n_2 = compte_2.numero;
        double s_2 = compte_2.solde;
        System.out.printf("n_2 = %s, s_2 = %.2f%n", n_2, s_2);

        System.out.println("compte_1 == compte_2 : " + compte_1.equals(compte_2));

        compte_1.numero = "001";
        compte_1.solde = 100;

        compte_2.numero = "001";
        compte_2.solde = 100;

        System.out.println("compte_1 == compte_2 : " + compte_1.equals(compte_2));

        compte_3 = compte_1;
        System.out.printf("n_3 = %s, s_3 = %.2f%n", compte_3.numero, compte_3.solde);

        compte_1.numero = "003";
        compte_1.solde = 21000000;

        System.out.printf("n_3 = %s, s_3 = %.2f%n", compte_3.numero, compte_3.solde);

        =============================================================
        */

        // Declaration d'une variable de type (Classe) Compte
        Compte compte_1, compte_2, compte_3;

        // Initialisation des variable de type Classe avec le mot cle new
        compte_1 = new Compte("10");
        System.out.println(Compte.getNbCompte());

        compte_2 = new Compte("20");
        System.out.println(Compte.getNbCompte());

        //compte_1.setNumero("001");
        double solde_1 = Compte.getNbCompte();

        //compte_1.setNumero("1");
        System.out.println("num_1 = " + compte_1.getNumero());
        System.out.println("num_2 = " + compte_2.getNumero());
        System.out.println("solde_1 = " + solde_1);

        compte_3 = new Compte("003", 200);
        System.out.println("num_3 = " + compte_3.getNumero());
        System.out.println("solde_3 = " + compte_3.getSolde());

        compte_1.crediter(500.5);
        System.out.println("solde_1 = " + compte_1.getSolde());

        System.out.println(compte_1.debiter(200) ? "Retrait effectué !!" : "Retait impossible");

        System.out.println(compte_1.description());
        System.out.println(compte_3.description());

        Personne francois = new Personne("François", LocalDate.of(1970, 02, 24));
        Personne gayet = new Personne("Gayet", LocalDate.of(1975, 03, 24));
        System.out.println(gayet.afficher());
        System.out.println(francois.afficher());

        francois.seMarier(gayet);

        System.out.println(gayet.afficher());
        System.out.println(francois.afficher());
    }
}
