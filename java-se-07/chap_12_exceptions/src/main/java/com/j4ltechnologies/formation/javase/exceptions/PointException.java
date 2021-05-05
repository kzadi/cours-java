package com.j4ltechnologies.formation.javase.exceptions;

/**
 * Classe PointException, créée le 15/04/2021 à 19:24
 *
 * @author Joachim Zadi
 * @version 1.0 du 15/04/2021
 */
public class PointException {

    //On definit une classe interne
    public static class Constructeur extends BaseException {
        public Constructeur(String message) {
            super(message);
        }
    }

    public static class Translater extends BaseException {
        public Translater(String message) {
            super(message);
        }
    }
}
