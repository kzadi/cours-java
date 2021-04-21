package com.j4ltechnologies.formation.javase;

import com.j4ltechnologies.formation.javase.classes.Personne;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe TestTriCollectionObjets, créée le 16/04/2021 à 08:37
 *
 * @author Joachim Zadi
 * @version 1.0 du 16/04/2021
 */
public class TestTriCollectionObjets {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(new Personne( "Alex",17));
        personnes.add(new Personne("Brian",47));
        personnes.add(new Personne("Piyush",37));
        personnes.add(new Personne("Charles",57));
        personnes.add(new Personne("Pawan",27));

        Collections.sort(personnes);
        System.out.println("personnes = " + personnes);
    }
}
