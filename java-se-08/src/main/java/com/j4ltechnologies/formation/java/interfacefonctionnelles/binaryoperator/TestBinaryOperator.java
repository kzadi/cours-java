package com.j4ltechnologies.formation.java.interfacefonctionnelles.binaryoperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * Classe TestBinaryOperator, créée le 05/05/2021 à 16:23
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestBinaryOperator {
    public static void main(String[] args) {

        // interface BinaryOperator<T> extends BiFunction<T, T, T> : C'est une interface fonctionnelle

        // Une Le BinaryOperator prend deux arguments du même type et renvoie un résultat
        // du type de ses arguments.

        // Dans cet exemple, la BiFunction<Integer, Integer, Integer> qui accepte et renvoie
        // le même type Integer, peut être remplacé par une BinaryOperator<Integer>.

        // BiFunction
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;

        Integer resultat = biFunction.apply(2, 3);
        System.out.println("resultat = " + resultat);

        // BinaryOperator
        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;

        resultat = binaryOperator.apply(2, 3);
        System.out.println("resultat = " + resultat);
    }
}
