package dev.jzadi.formation.javase.concretes;

import dev.jzadi.formation.javase.classes.Personne;
import dev.jzadi.formation.javase.interfaces.ICompositeur;
import dev.jzadi.formation.javase.interfaces.IMusicien;

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
