package com.j4ltechnologies.formation.javaee.dao;

import java.util.List;

import com.j4ltechnologies.formation.javaee.models.Adresse;
import com.j4ltechnologies.formation.javaee.models.Employe;

public interface IEmployeDao {

	List<Employe> getEmployes() throws Exception;

	void addEmploye(Employe employe, Adresse adresse) throws Exception;

	Employe findEmployeById(Integer id) throws Exception;

	Employe findEmployeByEmail(String email) throws Exception;

	Employe updateEmploye(Employe employe, Adresse adresse) throws Exception;

	void deleteEmploye(Integer id) throws Exception;
}
