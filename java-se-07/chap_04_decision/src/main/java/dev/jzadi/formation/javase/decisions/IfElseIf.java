package dev.jzadi.formation.javase.decisions;

import java.util.Scanner;

/**
 * Classe IfElseIf, créée le 18/04/2021 à 16:00
 *
 * @author Joachim Zadi
 * @version 1.0 du 18/04/2021
 */
public class IfElseIf {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.print("Etage: ");

        if (saisie.hasNextInt()) {
            // Nous savons maintenant que l'utilisateur a entré un entier
            int etage = saisie.nextInt();

            // On traite les cas invalides
            if (etage == 13) {
                System.out.println("Erreur: il n'y a pas d'etage N°13");
            } else if (etage <= 0 || etage > 20) {
                System.out.println("Erreur: l'étage doit être compris entre 1 et 20");
            } else {
                // Nous savons maintenant que l'entrée est valide
                int etageActuel = etage;

                if (etage > 13) {
                    etageActuel = etage - 1;
                }
                System.out.println("L'ascenseur se rendra à l'étage " + etageActuel);
            }
        } else {
            System.out.println("Erreur: Vous devez saisir un entier");
        }
    }
}
