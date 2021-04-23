package com.j4ltechnologies.formation.javaee.models;

/**
 * Classe permettant de representer une instance adresse de la BDD
 * 
 * @author Joachim
 *
 */
public class Adresse {

	private Integer id;
	private String nomVoie;
	private String codePostal;
	private String ville;

	public Adresse(Integer id, String nomVoie, String codePostal, String ville) {
		this.id = id;
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse(String nomVoie, String codePostal, String ville) {
		// this(null, nomVoie, codePostal, ville);
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codePostal == null) ? 0 : codePostal.hashCode());
		result = prime * result + ((nomVoie == null) ? 0 : nomVoie.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		Adresse other = (Adresse) obj;
		if (codePostal == null) {
			if (other.codePostal != null)
				return false;
		} else if (!codePostal.equalsIgnoreCase(other.codePostal))
			return false;
		if (nomVoie == null) {
			if (other.nomVoie != null)
				return false;
		} else if (!nomVoie.equalsIgnoreCase(other.nomVoie))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equalsIgnoreCase(other.ville))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Adresse [" + id + ", " + nomVoie + ", " + codePostal + ", " + ville + "]";
	}

}