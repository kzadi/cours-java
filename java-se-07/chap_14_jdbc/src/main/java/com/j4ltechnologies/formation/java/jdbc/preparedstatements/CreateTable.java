package com.j4ltechnologies.formation.java.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

public class CreateTable {

    public static void main(String[] args) {
        final String REQUETE = "create table if not exists stagiaire(" + "id 	int auto_increment,"
                + "nom 	varchar(20)	not null," + "age	int	not null,"
                + "created_at	datetime default CURRENT_TIMESTAMP," + "constraint stagiaire_pk primary key(id)" + ")";

        try {
            SimpleDataSource.init("mysqlParam");
            try (
                    Connection connection = SimpleDataSource.getConnection();
                    PreparedStatement ps = connection.prepareStatement(REQUETE)
            ) {
                ps.execute();
                String message = "Table Stagiaire créée avec succès";
                System.out.println(message);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
