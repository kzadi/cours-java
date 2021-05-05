package com.j4ltechnologies.formation.javase.enums;

/**
 * Classe Jour, créée le 21/04/2021 à 15:23
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public enum Jour {

    Lundi("Lu"), Mardi("Ma"), Mercredi("Me"), Jeudi("Je"), Vendredi("Ve"), Samedi("Sa"), Dimanche("Di");

    private String abreviation;

    Jour(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getAbreviation() {
        return abreviation;
    }
}
