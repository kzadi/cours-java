package com.j4ltechnologies.formation.java.jdbc.preraredstatements;

import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe UpdateLigne, créée le 22/04/2021 à 19:24
 *
 * @author Joachim Zadi
 * @version 1.0 du 22/04/2021
 */
public class UpdateLigne {
    public static void main(String[] args) {
        final String REQUETE = "UPDATE STAGIAIRE SET AGE=? WHERE NOM=?";
        try {
            SimpleDataSource.init("mysqlParam");
            try (
                    Connection connection = SimpleDataSource.getConnection();
                    PreparedStatement ps = connection.prepareStatement(REQUETE);
            ) {
                ps.setInt(1, 21);
                ps.setString(2, "Paterne");

                ps.executeUpdate();
                System.out.println("Stagiaire maj avec succès");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}