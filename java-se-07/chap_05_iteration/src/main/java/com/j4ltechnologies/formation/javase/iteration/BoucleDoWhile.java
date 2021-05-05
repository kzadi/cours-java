package com.j4ltechnologies.formation.javase.iteration;

/**
 * Classe BoucleDoWhile, créée le 18/04/2021 à 16:04
 *
 * @author Joachim Zadi
 * @version 1.0 du 18/04/2021
 */
public class BoucleDoWhile {
    public static void main(String[] args) {
        /*
         * Do While : La condition s'effectue en sortie de boucle !!!
         */
        int i = 1, val = 3;
        do {
            System.out.print(i * val + "\t");
            i++;
        } while (i < 10);

        // REALISER LA TABLE DE MULTIPLICATION AVEC LA BOUCLE DO_WHILE
    }
}