package com.j4ltechnologies.formation.javase.heritage.test;

import com.j4ltechnologies.formation.javase.classes.Personne;
import com.j4ltechnologies.formation.javase.heritage.Stagiaire;
import com.j4ltechnologies.formation.javase.heritage.StagiaireSalarie;

import java.time.LocalDate;

/**
 * Classe Lanceur, créée le 21/04/2021 à 14:12
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Lanceur {
    public static void main(String[] args) {
        Stagiaire s_1;

        s_1 = new Stagiaire("Vitor", LocalDate.of(1999, 02, 25));

        s_1.setCours("Java");
        s_1.setDuree(3);

        // System.out.println("duree = " + s_1.getDuree());

        Stagiaire s_2;

        s_2 = new Stagiaire("Adelie", LocalDate.of(1999, 02, 25), "Mars", 5);
        //System.out.println(s_2.afficher());

        //s_2.seMarier(s_1);
        //System.out.println(s_2.afficher());

        StagiaireSalarie ss_1;
        ss_1 = new StagiaireSalarie("Julie", LocalDate.of(1999, 02, 25), "Aviation", 5, 55000, "Solutec");

        Personne p = new Personne("Maxime", LocalDate.of(1999, 3, 3));

        Personne pp;

        pp = s_1;

        //System.out.println(pp.afficher());//afficher est une methode polymorphe

        Personne[] personnes = {s_1, ss_1, s_2, p};

        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }
}
