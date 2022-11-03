package dev.jzadi.formation.javase;

import dev.jzadi.formation.javase.classes.Personne;

import java.util.HashSet;

/**
 * Sets représente une collection d'éléments triés.
 * Les ensembles ne permettent pas les éléments en double.
 * L'interface Set ne fournit aucune garantie de renvoyer les éléments dans un ordre prévisible;
 * bien que certaines implémentations de Set stockent les éléments dans
 * leur ordre naturel et garantissent cet ordre.
 */
public class TestSet {
    public static void main(String[] args) {
        HashSet<String> noms = new HashSet<>();
        noms.add("Maxime");
        noms.add("Julie");
        noms.add("Adélie");
        noms.add("Thomas");
        noms.add("Julie");

        System.out.println("noms = " + noms);

        //Permet de voir si une collection contient un objet
        System.out.println(noms.contains("Julie"));

        HashSet<Personne> personnes =  new HashSet<>();
        Personne p1 =  new Personne("Maxime", 20);
        personnes.add(p1);

        Personne p2 =  new Personne("Thierry", 21);
        personnes.add(p2);

        Personne p3 =  new Personne("Adélie", 21);
        personnes.add(p3);

        Personne p4 =  new Personne("Thomas", 22);
        personnes.add(p4);

        Personne p5 =  new Personne("Victor", 23);
        personnes.add(p5);

        Personne p6 =  new Personne("Julie", 21);
        personnes.add(p6);

        System.out.println(personnes);
        System.out.println(personnes.contains(p6));

        //Retourne ssi la methode equals est definie dans la classe
        System.out.println(personnes.contains(new Personne("Julie", 21)));
    }
}
