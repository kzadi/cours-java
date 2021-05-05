package com.j4ltechnologies.formation.javase;

import java.util.ArrayList;

/**
 * List représente une collection ordonnée d'éléments. En utilisant des listes,
 * nous pouvons accéder aux éléments par leur index entier (position dans la liste),
 * et rechercher des éléments dans la liste.
 * L'index commence par 0, tout comme dans un tableau.
 */
public class TestList {
    public static void main(String[] args) {
        //Collection Generique

        //List generique de String
        ArrayList<String> maListe = new ArrayList<>();
        maListe.add("Maxime");
        maListe.add("Julie");
        maListe.add("Adélie");
        maListe.add("Thomas");

        System.out.println(maListe);
        System.out.println("Taille  = " + maListe.size());

        maListe.remove("Adélie");
        System.out.println(maListe);
        System.out.println("Taille  = " + maListe.size());

        maListe.add("Julie");
        System.out.println(maListe);
        System.out.println("Taille  = " + maListe.size());
    }
}
