package com.j4ltechnologies.formation.java.jdbc.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Classe TestMaConnexion, créée le 22/04/2021 à 20:23
 *
 * @author Joachim Zadi
 * @version 1.0 du 22/04/2021
 */
public class TestMaConnexion {
    public static void main(String[] args) {
        try {
            Connection connection = MaConnexion.getInstance().getConnection();
            System.out.println("CONNEXION OK");
        } catch (SQLException | ClassNotFoundException e) {
            System.err.format("SQLState: %s\n%s", e.getCause(), e.getMessage());
        }
    }
}