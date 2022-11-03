package dev.jzadi.formation.java.jdbc.models;

import java.time.LocalDateTime;

public class Stagiaire {

	private int id;
	private String nom;
	private int age;
	private LocalDateTime createdAt;

	public Stagiaire(int id, String nom, int age, LocalDateTime createdAt) {
		this.id = id;
		this.nom = nom;
		this.age = age;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Stagiaire [" + id + ", " + nom + ", " + age + " ans]";
	}
}
