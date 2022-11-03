package dev.jzadi.formation.javase.concretes;

import dev.jzadi.formation.javase.classes.Personne;
import dev.jzadi.formation.javase.interfaces.IMusicien;

/**
 * Classe Batteur, créée le 21/04/2021 à 14:55
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Batteur extends Personne implements IMusicien {

    public Batteur(String prenom, Integer age) {
        super(prenom, age);
    }

    @Override
    public String jouerInstrument() {
        return "Je joue de la batterie";
    }
}
