package com.j4ltechnologies.formation.javase.concretes;

import com.j4ltechnologies.formation.javase.classes.Personne;
import com.j4ltechnologies.formation.javase.interfaces.ICompositeur;
import com.j4ltechnologies.formation.javase.interfaces.IMusicien;

import java.time.LocalDate;

/**
 * Classe Maestro, créée le 21/04/2021 à 14:57
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Maestro extends Personne implements IMusicien, ICompositeur {
    public Maestro(String prenom, LocalDate ddn) {
        super(prenom, ddn);
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
