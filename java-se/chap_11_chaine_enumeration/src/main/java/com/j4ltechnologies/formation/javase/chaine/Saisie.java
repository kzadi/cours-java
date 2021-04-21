package com.j4ltechnologies.formation.javase.chaine;

import java.util.Scanner;

/**
 * Classe Saisie, créée le 21/04/2021 à 15:36
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Saisie {
    public static void main(String[] args) {
        // Créez un objet Scanner pour lire les entrées clavier.
        Scanner in = new Scanner(System.in);

        // Affichez une invite dans la fenêtre de la console.
        System.out.print("Veuillez saisir le nombre de bouteilles: ");
        int bouteilles = in.nextInt();
        System.out.println("bouteilles = " + bouteilles);

        System.out.print("Entrez le prix: ");
        double prix = in.nextDouble();
        System.out.println("prix = " + prix);

        // Formatter l'affichage
        double prixParLitre = 1.215962441314554;

        // La commande suivante affiche le prix avec deux chiffres après la virgule décimale:
        System.out.printf("prixParLitre = %.2f%n", prixParLitre);

        // Vous pouvez également spécifier une largeur de champ:
        System.out.printf("prixParLitre = %10.2f%n", prixParLitre);

        in.close();
    }
}
