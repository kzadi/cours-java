package com.j4ltechnologies.formation.javase.heritage;

import java.time.LocalDate;

/**
 * Classe StagiaireSalarie, créée le 21/04/2021 à 14:12
 *
 * @author Joachim Zadi
 * @version 1.0 du 21/04/2021
 */
public class StagiaireSalarie extends Stagiaire{

    private int salaire;
    private String societe;

    public StagiaireSalarie(String prenom, LocalDate ddn, String cours, int duree) {
        super(prenom, ddn, cours, duree);
    }

    public StagiaireSalarie(String prenom, LocalDate ddn, String cours, int duree, int salaire, String societe) {
        this(prenom, ddn, cours, duree);
        this.salaire = salaire;
        this.societe = societe;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntravailles chez" + societe + " et a pour salaire " + salaire + "€";
    }
}
