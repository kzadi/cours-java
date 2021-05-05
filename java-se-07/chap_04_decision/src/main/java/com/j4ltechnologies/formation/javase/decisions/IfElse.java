package com.j4ltechnologies.formation.javase.decisions;

import java.util.Scanner;

/**
 * Classe IfElse, créée le 18/04/2021 à 15:58
 *
 * @author Joachim Zadi
 * @version 1.0 du 18/04/2021
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        System.out.print("Etage: ");

        if (saisie.hasNextInt()) {
            //Ici l" user a saisi un entier
            int etage = saisie.nextInt();

            // Ajuster le sol si nécessaire
            int etageActuel;

            if (etage > 13) {
                etageActuel = etage - 1;
            } else {
                etageActuel = etage;
            }
            System.out.println("L'ascenseur se rendra à l'étage " + etageActuel);
        } else {
            System.out.println("Attention à votre saisie, un entier est attendu en entrée !!!");
        }
        saisie.close();
    }
}
