package dev.jzadi.formation.javase.tableaux;

/**
 * Classe BoucleForEach, créée le 21/04/2021 à 14:02
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class BoucleForEach {
    public static void main(String[] args) {
        /*
         * ForEach exemple de parcours de tableau simple
         */
        int[] tab = {12, 65, 8, 6, 36, 45, 954, 756};

        for (int val : tab) {
            System.out.print(val + "\t");
        }

        System.out.println("\n*************************\n");

        /*
         * Foreach sur un tableau complexe
         */
        int[][] matrice = {{4, 9, -28, 10}, {78, 4, -31, 25, 47, 3}};

        for (int[] t : matrice) {
            for (int i : t) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
