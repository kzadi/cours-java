package com.j4ltechnologies.formation.javaee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    public Adresse findAdresseById(int adresseId) throws SQLException {
        
        String requete = "select * from adresse where id = ?";
        Adresse adresse = null;
        try (PreparedStatement ps = connection.prepareStatement(requete)) {
            ps.setInt(1, adresseId);

            adresse = getAdresse(adresse, ps);
        }
        return adresse;
    }

    @Override
    public Adresse findAdresse(Adresse adresse) throws SQLException {
        
        String requete = "select * from adresse where nomVoie = ? and codePostal = ?  and ville = ?";

        Adresse adresseResult;

        try (PreparedStatement ps = connection.prepareStatement(requete)) {
            ps.setString(1, adresse.getNomVoie());
            ps.setString(2, adresse.getCodePostal());
            ps.setString(3, adresse.getVille());
            adresseResult = getAdresse(adresse, ps);
        }
        return adresseResult;
    }

    @Override
    public Adresse addAdresse(Adresse adresse) throws Exception {
        
        String requete = "insert into adresse(nomVoie, codePostal, ville) values(?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(requete)) {
            ps.setString(1, adresse.getNomVoie());
            ps.setString(2, adresse.getCodePostal());
            ps.setString(3, adresse.getVille());
            ps.executeUpdate();
            adresse.setId(getLastId());
        }
        return adresse;
    }

    private Adresse getAdresse(Adresse adresse, PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                int id = rs.getInt("id");
                String nomVoie = rs.getString("nomVoie");
                String codePostal = rs.getString("codePostal");
                String ville = rs.getString("ville");
                adresse = new Adresse(id, nomVoie, codePostal, ville);
            }
        }
        return adresse;
    }
}
