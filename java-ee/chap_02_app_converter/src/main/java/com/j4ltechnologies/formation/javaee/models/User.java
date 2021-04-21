package com.j4ltechnologies.formation.javaee.models;

/**
 * Classe User, créée le 21/04/2021 à 16:53
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class User {
    private String email;
    private String mdp;

    public User(String email, String mdp) {
        this.email = email;
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
