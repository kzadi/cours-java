package com.j4ltechnologies.formation.javase;

/**
 * Classe Simple, créée le 17/04/2021 à 10:28
 *
 * @author Joachim Zadi
 * @version 1.0 du 17/04/2021
 */
public class Simple {
    public static void main(String[] args) {
        // Afficher le message "Bonjour JAVA" dans la console
        System.out.println("Bonjour JAVA");

        //On peut aussi afficher le resulat d'un calcul
        System.out.println(4 + 2);
    }
}

/*
 * En java, la declaration d'une classe se fait avec le mot clé "class"
 *
 * Par convention, le nom d'une classe commence par une majuscule et si le nom de
 * la classe est composé, on utilisera la notation CamelCase.
 *
 * "public static void main(String[] args)" declare ici ce que l'on appelle une methode.
 * Toute application Java executable doit avoir une methode appelée "main".
 *
 * La methode main est la porte d'entrée de tout prog java
 *
 * Elle est executée par la JVM
 *
 * Le terme "static" sera expliquer plus tard.
 * Le terme "package" sera expilquer plus tard
 *
 * "System.out.println("Bonjour JAVA");" est appelé une instruction.
 * Comme la plupart des langages informatiques, une instruction se termine par un point virgule(;)
 *
 * Pour l'instant, vous pouvez vous contenter de considerer System.out.println comme un moyen
 * d'afficher dans la console
 */

class Tabs {
    public static void main(String[] args) {
        System.out.print("Nos meilleurs ventes sont :\n");
        System.out.print("\tMario Word Wii\n\tMachine NEspresso\n");
        System.out.println("\tAspirine");
    }
}

/*
 * Si plusieurs classes sont ecrites dans un meme fichier (ce qu'il faut eviter)
 * La classe declarée public donne son nom au fichier
 *
 * Toutes les autres classes ne peuvent pas etre declarée public
 *
 * println = print + new line
 * On peut utiliser des sequences d'echapement pour formater l'affichage dans la console
 */