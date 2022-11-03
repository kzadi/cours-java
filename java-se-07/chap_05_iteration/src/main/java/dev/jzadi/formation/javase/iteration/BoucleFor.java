package dev.jzadi.formation.javase.iteration;

/**
 * Classe BoucleFor, créée le 18/04/2021 à 16:19
 *
 * @author Joachim Zadi
 * @version 1.0 du 18/04/2021
 */
public class BoucleFor {
    public static void main(String[] args) {

        /*
         * La boucle for peut etre vue comme une boucle While compactée
         */
        int val = 3;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Bonjour ");
            System.out.println(i + " fois");
        }

        System.out.println("\n**********************\n");

        /*
         * Boucle For imbriquée
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
