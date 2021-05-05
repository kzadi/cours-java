package com.j4ltechnologies.formation.javase.declarations;

/**
 * Classe Variable, créée le 17/04/2021 à 16:10
 *
 * @author Joachim Zadi
 * @version 1.0 du 17/04/2021
 */
public class Variable {
    public static void main(String[] args) {

        // Declaration simple de variable
        int stagiaireId;

        // Assignation d'une valeur à la variable
        stagiaireId = 12;

        //Affichage du contenu de la variable
        System.out.println(stagiaireId);

        // Declaration suivie d'une assignation
        int autreVariable = 45;

        System.out.println("autreVariable = " + autreVariable);

        int var1, var2 = 3, var3;

        // On fait une reassignation de valeur
        stagiaireId = 25;
        System.out.println("stagiaireId = " + stagiaireId);

        // Depuis Java 10, vous n'avez pas besoin de spécifier le type de variable
        // que vous initialisez. Par exemple, au lieu de

        double longueur = 22.5;
        String salut = "Hello";

        // Une variable declarée dans une methode doit etre initialisée avant d'etre utilisée
        // int varNonInitialise;
        // System.out.println("varNonInitialise = " + varNonInitialise);//Ne compile pas
    }
}