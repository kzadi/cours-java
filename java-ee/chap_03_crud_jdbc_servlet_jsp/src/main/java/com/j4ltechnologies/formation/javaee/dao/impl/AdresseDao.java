package com.j4ltechnologies.formation.javaee.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.j4ltechnologies.formation.javaee.MaConnexion;
import com.j4ltechnologies.formation.javaee.dao.IAdresseDao;
import com.j4ltechnologies.formation.javaee.models.Adresse;

public class AdresseDao implements IAdresseDao {

	private Connection connection;

	public AdresseDao() throws ClassNotFoundException, SQLException {
		connection = MaConnexion.getInstance().getConnection();
	}

	@Override
	public List<Adresse> getAdresses() throws Exception {

		String requete = "SELECT * FROM ADRESSE";

		List<Adresse> adresses = new ArrayList<>();

		try (Statement stm = connection.createStatement()) {
			try (ResultSet rs = stm.executeQuery(requete)) {
				while (rs.next()) {
					Integer id = rs.getInt("id");
					String nomVoie = rs.getString("nomVoie");
					String codePostal = rs.getString("codePostal");
					String ville = rs.getString("ville");

					Adresse adresse = new Adresse(id, nomVoie, codePostal, ville);
					adresses.add(adresse);
				}
			}
		}

		return adresses;
	}

	@Override
	public Integer getLastId() {

		String requete = " SELECT * FROM ADRESSE";
		Integer id = -1;
		
		try(Statement stm = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)){
			try(ResultSet rs = stm.executeQuery(requete)){
				rs.last();
				id = rs.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public Adresse findAdresseById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse findAdresse(Adresse adresse) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse addAdresse(Adresse adresse) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Connection getConnection() {
		return connection;
	}
}
