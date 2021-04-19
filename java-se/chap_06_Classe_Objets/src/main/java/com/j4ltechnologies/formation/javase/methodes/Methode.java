package com.j4ltechnologies.formation.javase.methodes;

/**
 * Classe Methode, créée le 19/04/2021 à 19:48
 *
 * @author Joachim Zadi
 * @version 1.0 du 19/04/2021
 */
public class Methode {
    // Pas d'obligation d'initailisation
    static int somme;
    static String nom;

    public static void main(String[] args) {
        salut();
        salut(45);
        salut("Victor", 22);
        System.out.println("somme = " + somme);
        System.out.println("nom = " + nom);

        // Obligation d'initialisation
        double autreSomme = 45.01;
        System.out.println("autreSomme = " + autreSomme);
    }

    // Declaration d'une méthode
    static void salut() {
        System.out.println("Salut");
    }

    // Methode avec un argument
    static void salut(String prenom) {
        System.out.println("Salut " + prenom);
    }

    static void salut(int age) {
        System.out.println("Vous avez " + age + " ans");
    }

    static void salut(String p, int a) {
        System.out.printf("Bonjour %s, vous avez %d ans%n", p, a);
    }

    static void salut(int a, String p) {
        salut(p, a);
    }
}
