package com.j4ltechnologies.formation.java.jdbc.preraredstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.j4ltechnologies.formation.java.jdbc.utils.SimpleDataSource;

public class InsertionLigne {

	public static void main(String[] args) {
		final String REQUETE = "insert into employe(nom,salaire) values(?, ?)"; 

		try {
			SimpleDataSource.init("mysqlParam");
			try(
					Connection connection = SimpleDataSource.getConnection();
					PreparedStatement ps = connection.prepareStatement(REQUETE);
				){
				ps.setString(1, "Paterne");
				ps.setInt(2, 5000);
				
				ps.executeUpdate();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
