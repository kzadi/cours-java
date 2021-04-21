package com.j4ltechnologies.formation.javase.concretes;

import com.j4ltechnologies.formation.javase.classes.Personne;
import com.j4ltechnologies.formation.javase.interfaces.IMusicien;

import java.time.LocalDate;

/**
 * Classe Batteur, créée le 21/04/2021 à 14:55
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Batteur extends Personne implements IMusicien {

    public Batteur(String prenom, LocalDate ddn) {
        super(prenom, ddn);
    }

    @Override
    public String jouerInstrument() {
        return "Je joue de la batterie";
    }
}
