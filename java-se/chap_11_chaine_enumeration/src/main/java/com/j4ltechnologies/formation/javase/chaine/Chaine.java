package com.j4ltechnologies.formation.javase.chaine;

import java.util.Objects;
import java.util.Scanner;

/**
 * Classe Chaine, créée le 21/04/2021 à 15:36
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Chaine {
    public static void main(String[] args) {
        // Declaration d'une chaine de caracteres
        String prenom = "Joachim";
        String chaineVide = "";
        System.out.printf("prenom = %s%nchaineVide = %s%n", prenom, chaineVide);

        // La methode length()
        int longueurPrenom = prenom.length();
        System.out.printf("longueurPrenom = %s%n", longueurPrenom);

        int longueurChaineVide = chaineVide.length();
        System.out.printf("longueurChaineVide = %s%n", longueurChaineVide);

        // Concactenation avec loperateur +
        String nom = "Dupont";
        String nomComplet = prenom + nom;
        System.out.println("nomComplet = " + nomComplet);
        nomComplet = prenom + " " + nom;
        System.out.println("nomComplet = " + nomComplet);

        // Séquences d'échappement \
        // Il te passe le "BONJOUR"
        String salut = "Il te passe le \"BONJOUR\"";
        System.out.println("salut = " + salut);

        // C:\data\db\Secret.txt
        String repertoire = "C:\\data\\db\\Secret.txt";
        System.out.println("repertoire = " + repertoire);

        // Egalité des chaines de caracteres
        salut = "Bonjour";

        System.out.println(salut == "Bonjour");
        System.out.println(salut.substring(0, 3));

        // A proscrire
        System.out.println(salut.substring(0, 3) == "Bon");

        // Privilegié la methode equals()
        System.out.println(salut.substring(0, 3).equals("Bon"));
        System.out.println(Objects.equals(salut.substring(0, 3), "Bon"));
        System.out.println(salut.startsWith("Bon"));

        System.out.print("\n*\n**\n***\n****\n\n");


        // Saisie clavier
        Scanner saisie = new Scanner(System.in);

        // Lecture de la ligne saisie
        System.out.print("Entrez votre nom complet : ");
        nomComplet = saisie.nextLine();
        System.out.println("Votre nom complet est " + nomComplet);

        // Lecture du premier mot de la ligne saisie
        System.out.print("\nEntrez votre nom complet : ");
        nomComplet = saisie.next();
        System.out.println("Votre nom complet est " + nomComplet);

        saisie.close();
    }
}
