package dev.jzadi.formation.javase.abstracts;

/**
 * Classe Felin, créée le 21/04/2021 à 14:33
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public abstract class Felin extends Animal {
    public Felin(String couleur, double poids) {
        super(couleur, poids);
    }

    @Override
    public String mange() {
        return "Je mange de la viande";
    }
}
