package dev.jzadi.formation.javase.tableaux;

import java.util.Arrays;

/**
 * Classe Tableau, créée le 19/04/2021 à 20:14
 *
 * @author Joachim Zadi
 * @version 1.0 du 19/04/2021
 */
public class Tableau {
    public static void main(String[] args) {
        // Supposons que vous écriviez un programme qui lit une séquence de valeurs
        // et imprime la séquence en marquant la plus grande valeur

        // En Java, un tableau est un bien meilleur choix pour stocker une séquence de valeurs du même type.
        // Ici, nous créons un tableau qui peut contenir dix valeurs de type double:

        double[] valeurs;

        //Initailisation du tableau
        valeurs = new double[10];
        // System.out.println(valeurs);
        System.out.printf("valeurs = %s%n", Arrays.toString(valeurs));


        // Assignation d'une valeur à un indice du tableau
        valeurs[0] = 5.;
        valeurs[5] = -2.5;
        System.out.printf("valeurs = %s%n", Arrays.toString(valeurs));

        // Taille du tableau
        int tailleValeurs = valeurs.length;
        System.out.println("tailleValeurs = " + tailleValeurs);

        // Un tableau de cinq entiers, avec des valeurs initiales
        int[] carrees = {0, 1, 4, 9, 16};
        System.out.println("carrees = " + Arrays.toString(carrees));

        // Un tableau de trois chaînes.
        String[] amis = {"Emily", "Bob", "Cindy"};
        System.out.printf("amis = %s%n", Arrays.toString(amis));

        // double[] data = new int[10];==> ne compile pas

        // Déclaration de tableaux bidimensionnels
        // En Java, vous obtenez un tableau à deux dimensions en fournissant le nombre de lignes et de colonnes.
        // Par exemple, new int [7] [3] est un tableau avec sept lignes et trois colonnes.
        // Vous stockez une référence à un tel tableau dans une variable de type int [] [].
        // Voici une déclaration complète d'un tableau à deux dimensions, adapté pour contenir nos données de
        // comptage de médailles:

        final int COURSES = 8;
        final int MEDAILLES = 3;
        int[][] comptes = new int[COURSES][MEDAILLES];
        System.out.printf("comptes = %s%n", Arrays.toString(comptes));

        // Alternativement
        int[][] counts = {{0, 3, 0}, {0, 0, 1}, {0, 0, 1}, {1, 0, 0}, {0, 0, 1}, {3, 1, 1}, {0, 1, 0}, {1, 0, 1}};
        System.out.printf("counts = %s%n", Arrays.toString(counts));

        // Acces aux elements
        int medailCount = counts[5][0];
        System.out.println("medailCount = " + medailCount);


    }
}

/*
 * Une fois la taille du tableau fixée, on peut plus la modifier
 *
 * Dans un tableau, le premier element a l'indice 0 et celui du
 * dernier element est (taille - 1)
 *
 * On determine la taille du tableau avec la methode length
 */