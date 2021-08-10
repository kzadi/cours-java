package com.j4ltechnologies.formation.java.jdbc.preparedstatements;

import com.j4ltechnologies.formation.java.jdbc.models.Stagiaire;
import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

import java.sql.*;

/**
 * Classe SelectAll, créée le 22/04/2021 à 19:31
 *
 * @author Joachim Zadi
 * @version 1.0 du 22/04/2021
 */
public class SelectAll {
    public static void main(String[] args) {
        final String REQUETE = "select * from stagiaire";
        try {
            SimpleDataSource.init("mysqlParam");
            try (
                    Connection connection = SimpleDataSource.getConnection();
                    PreparedStatement ps = connection.prepareStatement(REQUETE)
            ) {
                ResultSet rs = ps.executeQuery();
                parcoursResultSet(rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void parcoursResultSet(ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("id");
            String nom = rs.getString("nom");
            int age = rs.getInt("age");
            Timestamp created_at = rs.getTimestamp("created_at");

            Stagiaire stagiaire = new Stagiaire(id, nom, age, created_at.toLocalDateTime());
            System.out.println(stagiaire);
        }
    }
}
