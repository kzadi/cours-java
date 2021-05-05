package com.j4ltechnologies.formation.javase.heritage;

import com.j4ltechnologies.formation.javase.classes.Personne;

/**
 * Classe Stagiaire, créée le 21/04/2021 à 14:10
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Stagiaire extends Personne {

    private String cours;
    private int duree;

    public Stagiaire(String prenom, Integer age) {
        super(prenom, age);
    }

    public Stagiaire(String prenom, Integer age, String cours, int duree) {
        super(prenom, age);
        this.cours = cours;
        this.duree = duree;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return super.toString() +"suit le cours " + cours + " pour une durée de " + duree + " jours";
    }
}
