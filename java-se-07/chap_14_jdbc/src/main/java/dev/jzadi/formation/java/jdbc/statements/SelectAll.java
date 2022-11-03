package dev.jzadi.formation.java.jdbc.statements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import dev.jzadi.formation.java.jdbc.models.Stagiaire;
import dev.jzadi.formation.java.jdbc.utils.SimpleDataSource;

public class SelectAll {

    public static void main(String[] args) {
        final String REQUETE = "select * from stagiaire";
        try {
            SimpleDataSource.init("mysqlParam");
            try (
                    Connection connection = SimpleDataSource.getConnection();
                    Statement statement = connection.createStatement()
            ) {
                ResultSet rs = statement.executeQuery(REQUETE);
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
