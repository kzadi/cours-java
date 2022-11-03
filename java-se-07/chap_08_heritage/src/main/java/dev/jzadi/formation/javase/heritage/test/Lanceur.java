package dev.jzadi.formation.javase.heritage.test;

import dev.jzadi.formation.javase.classes.Personne;
import dev.jzadi.formation.javase.heritage.Stagiaire;
import dev.jzadi.formation.javase.heritage.StagiaireSalarie;

/**
 * Classe Lanceur, créée le 21/04/2021 à 14:12
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Lanceur {
    public static void main(String[] args) {
        Stagiaire s_1;

        s_1 = new Stagiaire("Vitor", 30);

        s_1.setCours("Java");
        s_1.setDuree(3);

        // System.out.println("duree = " + s_1.getDuree());

        Stagiaire s_2;

        s_2 = new Stagiaire("Adelie", 26, "Mars", 5);
        //System.out.println(s_2.afficher());

        //s_2.seMarier(s_1);
        //System.out.println(s_2.afficher());

        StagiaireSalarie ss_1;
        ss_1 = new StagiaireSalarie("Julie", 25, "Aviation", 5, 55000, "Solutec");

        Personne p = new Personne("Maxime", 25);

        Personne pp;

        pp = s_1;

        //System.out.println(pp.afficher());//afficher est une methode polymorphe

        Personne[] personnes = {s_1, ss_1, s_2, p};

        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }
}
