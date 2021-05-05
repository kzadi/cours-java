package com.j4ltechnologies.formation.javase.concretes;

import com.j4ltechnologies.formation.javase.classes.Personne;
import com.j4ltechnologies.formation.javase.interfaces.ICompositeur;
import com.j4ltechnologies.formation.javase.interfaces.IMusicien;

/**
 * Classe Maestro, créée le 21/04/2021 à 14:57
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Maestro extends Personne implements IMusicien, ICompositeur {
    public Maestro(String prenom, Integer age) {
        super(prenom, age);
    }

    @Override
    public String ecrirePartition() {
        return "J'ecris des partions";
    }

    @Override
    public String jouerInstrument() {
        return "Je joue au violon";
    }
}
