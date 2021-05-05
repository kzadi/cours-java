package com.j4ltechnologies.formation.java.interfacefonctionnelles.bipredicate;

import java.util.function.BiPredicate;

/**
 * Classe TestBiPredicate, créée le 05/05/2021 à 18:56
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestBiPredicate {
    public static void main(String[] args) {

        // En Java 8, BiPredicate est une interface fonctionnelle, qui accepte deux arguments
        // et renvoie un booléen.

        // Fondamentalement une BiPredicate est le même avec le prédicat, à la place,
        // il prend 2 arguments pour le test

        BiPredicate<String, Integer> filtre = (x, y) -> {
            return x.length() == y;
        };

        boolean resultat = filtre.test("joachim", 7);
        System.out.println(resultat);  // true

        resultat = filtre.test("java", 10);
        System.out.println(resultat); // false
    }
}
