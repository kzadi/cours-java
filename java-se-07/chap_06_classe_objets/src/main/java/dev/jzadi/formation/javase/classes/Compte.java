package dev.jzadi.formation.javase.classes;

/**
 * Classe Compte, créée le 19/04/2021 à 19:52
 * Declarer une classe, c'est declarer un nouveau type en Java
 *
 * @author Joachim Zadi
 * @version 1.0 du 19/04/2021
 */
public class Compte {
    // Les attributs ==> de preference private
    // L'encapsulation ==> private
    private final String numero;
    private double solde;

    //Attribut de classe
    private static int nbCompte;

    // Un constructeur de la classe
    public Compte(String n) {
        numero = n;
        solde = 80;
        nbCompte++;
    }

    // Surcharge du constructeur
    public Compte(String n, double montant) {
        numero = n;
        solde = montant + 80;
        nbCompte++;
    }

    //Methode de classe
    public static int getNbCompte() {
        return nbCompte;
    }

    public double getSolde() {
        return solde;
    }

    public String getNumero() {
        return numero;
    }

    public void crediter(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public boolean debiter(double montant) {
        if (montant > solde) {
            return false;
        } else {
            solde -= montant;
            return true;
        }
    }

    public String description() {
        return String.format("Compte(N°: %s, Solde : %s)", numero, solde);
    }
}
