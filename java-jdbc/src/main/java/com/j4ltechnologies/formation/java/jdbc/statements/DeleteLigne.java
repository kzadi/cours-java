package com.j4ltechnologies.formation.java.jdbc.statements;

import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteLigne {
    public static void main(String[] args) {
        try {
            SimpleDataSource.init("mysqlParam");
            try (
                    Connection connection = SimpleDataSource.getConnection();
                    Statement statement = connection.createStatement()
            ) {
                statement.executeUpdate(deleteByNom("Anas"));
                System.out.println("Stagiaire supprimé avec succès");
            } catch (SQLException e) {
                System.err.format("SQLState: %s\n%s", e.getSQLState(), e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String deleteByNom(String nom) {
        return "DELETE FROM STAGIAIRE WHERE NOM='" + nom + "'";
    }
}