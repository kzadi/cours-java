package com.j4ltechnologies.formation.javaee.dao;

import java.util.List;

import com.j4ltechnologies.formation.javaee.models.Adresse;

public interface IAdresseDao {

	List<Adresse> getAdresses() throws Exception;

	Integer getLastId();

	Adresse findAdresseById(int id) throws Exception;

	Adresse findAdresse(Adresse adresse) throws Exception;

	Adresse addAdresse(Adresse adresse) throws Exception;
}
