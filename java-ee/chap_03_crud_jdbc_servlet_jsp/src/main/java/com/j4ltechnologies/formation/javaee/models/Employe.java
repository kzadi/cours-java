package com.j4ltechnologies.formation.javaee.models;

import java.time.LocalDate;

public class Employe {

	private Integer id;
	private String prenom;
	private String email;
	private String mdp;
	private Adresse adresse;
	private LocalDate ddn;
	private String role;

	public Employe(Integer id, String prenom, String email, String mdp, Adresse adresse, LocalDate ddn, String role) {
		this.id = id;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.adresse = adresse;
		this.ddn = ddn;
		this.role = role;
	}

	public Employe(Integer id, String prenom, String email, String mdp, LocalDate ddn, String role) {
		this.id = id;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.ddn = ddn;
		this.role = role;
	}

	public Employe(String prenom, String email, String mdp, LocalDate ddn, String role) {
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.ddn = ddn;
		this.role = role;
	}

	public Employe() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public LocalDate getDdn() {
		return ddn;
	}

	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equalsIgnoreCase(other.email))
			return false;
		return true;
	}
}
