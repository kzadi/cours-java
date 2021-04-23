package com.j4ltechnologies.formation.javaee.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.j4ltechnologies.formation.javaee.MaConnexion;
import com.j4ltechnologies.formation.javaee.dao.IAdresseDao;
import com.j4ltechnologies.formation.javaee.dao.IEmployeDao;
import com.j4ltechnologies.formation.javaee.models.Adresse;
import com.j4ltechnologies.formation.javaee.models.Employe;

public class EmployeDao implements IEmployeDao {

	private Connection connection;
	private IAdresseDao adresseDao;

	public EmployeDao() throws ClassNotFoundException, SQLException {
		connection = MaConnexion.getInstance().getConnection();
		adresseDao = new AdresseDao();
	}

	@Override
	public List<Employe> getEmployes() throws Exception {

		String requete= "SELECT * FROM EMPLOYE";
		List<Employe> employes;
		try(Statement stm = connection.createStatement()){
			employes = new ArrayList<>();
			try(ResultSet rs = stm.executeQuery(requete)){
				while(rs.next()) {
					int id = rs.getInt("id");
					String prenom = rs.getString("prenom");
					String email = rs.getString("email");
					String mdp = "";
					LocalDate ddn = rs.getDate("ddn").toLocalDate();
					String role = rs.getString("role");
					Adresse adresse = adresseDao.findAdresseById(rs.getInt("adresseId")) ;
					
					Employe employe = new Employe(id, prenom, email, mdp, adresse, ddn, role);
					employes.add(employe);
				}
			}
		}				
		return employes;
	}

	@Override
	public void addEmploye(Employe employe, Adresse adresse) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Employe findEmployeById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe findEmployeByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe updateEmploye(Employe employe, Adresse adresse) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmploye(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

}
