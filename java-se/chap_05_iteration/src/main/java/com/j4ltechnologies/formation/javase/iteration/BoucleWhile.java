package com.j4ltechnologies.formation.javase.iteration;

/**
 * Classe BoucleWhile, créée le 18/04/2021 à 16:11
 *
 * @author Joachim Zadi
 * @version 1.0 du 18/04/2021
 */
public class BoucleWhile {
    public static void main(String[] args) {
        /*
         * While : La condition s'effectue avant l'entrée dans la boucle
         */

        int i = 1, val = 3;

        while (i < 10) {
            System.out.printf("%d\t", i * val);
            i++;
        }

        /*
         * Exercice : Table de multiplication
         */
        System.out.println("\n\n**********************\n");
        int j = 1;

        while (j < 10) {
            System.out.printf("\nTable de %s%n", j);
            int k = 1;
            while (k < 10) {
                System.out.println(j + " x " + k + " = " + (j * k) + "\t");
                k++;
            }
            j++;
            System.out.println();
        }
    }
}
