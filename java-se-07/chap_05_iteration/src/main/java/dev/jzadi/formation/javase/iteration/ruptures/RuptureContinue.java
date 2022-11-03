package dev.jzadi.formation.javase.iteration.ruptures;

/**
 * Classe RuptureContinue, créée le 19/04/2021 à 19:33
 *
 * @author Joachim Zadi
 * @version 1.0 du 19/04/2021
 */
public class RuptureContinue {
    public static void main(String[] args) {
        /*
         * L'instruction continue permet de passer prematurement au
         * tour de boucle suivant
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nDebut Tour " + i);
            if (i < 5) {
                continue;
            }
            System.out.println("Fin Tour " + i);
        }
    }
}
