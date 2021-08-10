package com.j4ltechnologies.formation.javase.classes;

import java.time.LocalDate;
import java.time.Period;

/**
 * Classe Personne, créée le 19/04/2021 à 19:55
 *
 * @author Joachim Zadi
 * @version 1.0 du 19/04/2021
 */
public class Personne {

    private String prenom;
    private final Integer age;
    private Personne conjoint;

    public Personne(String prenom, Integer age) {
        this.prenom = prenom;
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personne other = (Personne) obj;
        if (prenom == null) {
            return other.prenom == null;
        } else return prenom.equals(other.prenom);
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Integer getAge() {
        return age;
    }

    public Personne getConjoint() {
        return conjoint;
    }

    public void seMarier(Personne p) {

        if ((getAge() > 18) && (p.getAge() > 18) && conjoint == null && p.conjoint == null) {
            conjoint = p;
            p.conjoint = this; //this ==> fait reference a l'objet courant
        }
    }

    public String afficher() {
        String affichage = String.format("%s, %s ans ", prenom, getAge());
        if (conjoint != null) {
            affichage += String.format("a pour conjoint %s, %s ans\n", conjoint.prenom, conjoint.getAge());
        }
        return affichage;
    }

    @Override
    public String toString() {
        String affichage = String.format("%s, %s ans ", prenom, getAge());
        if (conjoint != null) {
            affichage += String.format("a pour conjoint %s, %s ans\n", conjoint.prenom, conjoint.getAge());
        }
        return affichage;
    }
}
