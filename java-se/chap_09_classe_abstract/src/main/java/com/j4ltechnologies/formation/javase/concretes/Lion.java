package com.j4ltechnologies.formation.javase.concretes;

import com.j4ltechnologies.formation.javase.abstracts.Felin;

/**
 * Classe Lion, créée le 21/04/2021 à 14:37
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class Lion extends Felin {
    public Lion(String couleur, double poids) {
        super(couleur, poids);
    }

    @Override
    protected String crier() {
        return "Je rugis";
    }
}
