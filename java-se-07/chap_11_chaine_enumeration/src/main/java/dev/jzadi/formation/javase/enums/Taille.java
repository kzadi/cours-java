package dev.jzadi.formation.javase.enums;

/**
 * Classe Taille, créée le 21/04/2021 à 15:14
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */public enum Taille {

    XS, M, XL, XXL;

    public String affche() {
        return this.toString();
    }
}