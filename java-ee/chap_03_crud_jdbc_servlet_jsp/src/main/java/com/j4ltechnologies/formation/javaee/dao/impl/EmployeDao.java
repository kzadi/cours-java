package com.j4ltechnologies.formation.javaee.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.j4ltechnologies.formation.javaee.MaConnexion;
import com.j4ltechnologies.formation.javaee.dao.IEmployeDao;
import com.j4ltechnologies.formation.javaee.models.Adresse;
import com.j4ltechnologies.formation.javaee.models.Employe;

public class EmployeDao implements IEmployeDao {

	private Connection connection;
	
	public EmployeDao() throws ClassNotFoundException, SQLException {
		connection = MaConnexion.getInstance().getConnection();
	}

	@Override
	public List<Employe> getEmployes() throws Exception {
		// TODO Auto-generated method stub
		return null;
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
