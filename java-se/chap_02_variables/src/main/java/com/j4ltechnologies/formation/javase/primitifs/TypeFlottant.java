package com.j4ltechnologies.formation.javase.primitifs;

/**
 * Classe TypeFlottant, créée le 17/04/2021 à 16:35
 *
 * @author Joachim Zadi
 * @version 1.0 du 17/04/2021
 */
public class TypeFlottant {
    public static void main(String[] args) {

        // Les types flottants permettent de representer, de maniere approchée,
        // une partie des nombres reels.

        System.out.println("==== Type float ====");
        /*
         * Le type float est un flottant signé et codé sur 4 octets soit 32-bits.
         * Sa valeur par defaut est 0
         */
        float unFloat = -2698.25f;
        System.out.printf("unFloat = %s%n", unFloat);
        System.out.printf("floatMin = %s%n", Float.MIN_VALUE);
        System.out.printf("floatMax = %s%n", Float.MAX_VALUE);

        System.out.println("\n==== Type double ====");

        /*
         * Le type double est un entier signé et codé sur 8 octets soit 64-bits.
         * Sa valeur par defaut est 0
         */
        double unDouble = -269878965.36;
        System.out.printf("unDouble = %s%n", unDouble);
        System.out.printf("doubleMin = %s%n", Double.MIN_VALUE);
        System.out.printf("doubleMax = %s%n", Double.MAX_VALUE);

        //La divisio par 0 est autorisée avec les Flottants ==> Infinity
        System.out.printf("divideByZero = %s%n", unDouble/0);
        System.out.printf("divideByInfiny = %s%n", unDouble/Double.POSITIVE_INFINITY);

        //NaN (Not a Number) est un non Flottant
        System.out.printf("NaN = %s%n", Double.NaN);
        System.out.printf("0/0 = %s%n", 0/0.);
    }
}
