package com.j4ltechnologies.formation.javase.abstracts;

/**
 * Classe Animal, créée le 21/04/2021 à 14:32
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public abstract class Animal {
    private String couleur;
    private double poids;

    public Animal(String couleur, double poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    //abstract void seDeplacer();
    public String boire() {
        return "Je bois de l'eau";
    }

    abstract String mange();

    protected abstract String crier();

    @Override
    public String toString() {
        return String.format("Je suis un %s, ma couleur est %s et je pèse %s kg\n%s, %s , %s\n", getClass().getSimpleName(), couleur, poids,
                crier(), boire(), mange());
    }
}
