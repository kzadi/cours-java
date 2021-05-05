package com.j4ltechnologies.formation.java.interfacefonctionnelles.predicate;

import java.util.function.Predicate;

/**
 * Classe TestPredicateChainage, créée le 05/05/2021 à 18:47
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestPredicateChainage {
    public static void main(String[] args) {

        Predicate<String> commenceParA = x -> x.startsWith("a");

        // Commence par "a" ou "m"
        boolean resultat = commenceParA.or(x -> x.startsWith("j")).test("joachim");
        System.out.println(resultat);     // true

        // !(commence par "a" et la longueur est de 3)
        resultat = commenceParA.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(resultat);    // false
    }
}
