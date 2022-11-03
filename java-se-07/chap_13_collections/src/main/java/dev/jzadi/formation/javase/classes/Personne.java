package dev.jzadi.formation.javase.classes;

import java.util.Objects;

/**
 * Classe Personne, créée le 21/04/2021 à 15:47
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Personne implements Comparable<Personne>{
    private String prenom;
    private Integer age;

    public Personne(String prenom, int age) {
        this.prenom = prenom;
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenom, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return age == personne.age && prenom.equals(personne.prenom);
    }

    @Override
    public String toString() {
        return "(" + prenom + " : " + age + " ans)";
    }

    @Override
    public int compareTo(Personne o) {
        //return prenom.compareTo(o.prenom);
        return age.compareTo(o.age);
    }
}
