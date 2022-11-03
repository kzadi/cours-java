package dev.jzadi.formation.javase.concretes;

import dev.jzadi.formation.javase.abstracts.Felin;

/**
 * Classe Chat, créée le 21/04/2021 à 14:38
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Chat extends Felin {
    public Chat(String couleur, double poids) {
        super(couleur, poids);
    }

    @Override
    protected String crier() {
        return "Je miaule";
    }
}
