package dev.jzadi.formation.java.interfacefonctionnelles.function;

import java.util.function.Function;

/**
 * Classe TestFunctionChainage, créée le 05/05/2021 à 12:41
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestFunctionChainage {
    public static void main(String[] args) {

        // On peut chainer les fonctions avec la methode "andThen()".
        Function<String, Integer> fonction = x -> x.length();
        Function<Integer, Integer> autreFonction = x -> x * 2;
        Integer resultat = fonction.andThen(autreFonction).apply("Joachim");
        System.out.println("resultat = " + resultat);
    }
}
