package com.j4ltechnologies.formation.java.interfacefonctionnelles.bifunction;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;

/**
 * Classe TestBiFunction, créée le 05/05/2021 à 14:07
 *
 * @author Joachim Zadi
 * @version 1.0 du 05/05/2021
 */
public class TestBiFunction {
    public static void main(String[] args) {
        // Dans Java 8, BiFunction est une interface fonctionnelle
        // Elle prend deux arguments et renvoie un objet

        // prend deux entiers en arguments et renvoie un entier
        BiFunction<Integer, Integer, Integer> biFunctionInteger = (x, y) -> x + y;

        Integer resultatInteger = biFunctionInteger.apply(5, 9);
        System.out.println("resultat = " + resultatInteger);

        // prend deux entiers en arguments et renvoie un double
        BiFunction<Integer, Integer, BigDecimal> biFunctionDouble = (x, y) -> BigDecimal.valueOf(Math.pow(x, y));
        BigDecimal resultatBigDecimal = biFunctionDouble.apply(2,5);
        resultatBigDecimal = resultatBigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.println("biFunctionDouble = " + resultatBigDecimal);
    }
}
