package com.j4ltechnologies.formation.javase.exceptions;

/**
 * Classe BaseException, créée le 15/04/2021 à 19:20
 * Rendre cette classe abstraite pour que les développeurs soient obligés de créer
 * types d'exception appropriés uniquement
 *
 * @author Joachim Zadi
 * @version 1.0 du 15/04/2021
 */
public abstract class BaseException extends Exception{
    private String message;

    public BaseException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
