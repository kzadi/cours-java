package dev.jzadi.formation.javase.iteration.ruptures;

/**
 * Classe RuptureBreak, créée le 19/04/2021 à 19:21
 *
 * @author Joachim Zadi
 * @version 1.0 du 19/04/2021
 */
public class RuptureBreak {
    public static void main(String[] args) {
        /*
         * Nous avons deja vu le role du break au sein d'un bloc regi par une
         * instruction switch.
         *
         * Java nous autorise egalement à utiliser cette instruction dans une
         * boucle (while, do...while ou for)
         *
         * Dans ce cas, elle sert à interrompre le deroulement de la boucle,
         * en passant à l'instruction suivante
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("Debut Tour " + i);
            System.out.println("Bonjour");
            if (i == 5) {
                break;
            }
            System.out.printf("Fin Tour %s%n%n", i);
        }
        System.out.println("\nJe suis executé apres la boucle");
    }
}
