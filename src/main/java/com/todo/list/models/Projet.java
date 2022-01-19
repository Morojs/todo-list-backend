package com.todo.list.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String description;
	private Date dateCreation;

	@OneToMany(targetEntity = Tache.class, mappedBy = "tache")
	private List<Tache> taches = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "idChefProjet", nullable = false)
	private ChefProjet chefProjet;

	public Projet(int id, String nom, String description, Date dateCreation, List<Tache> taches,
			ChefProjet chefProjet) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.dateCreation = dateCreation;
		this.taches = taches;
		this.chefProjet = chefProjet;
	}

	public Projet(String nom, String description, Date dateCreation, List<Tache> taches, ChefProjet chefProjet) {
		super();
		this.nom = nom;
		this.description = description;
		this.dateCreation = dateCreation;
		this.taches = taches;
		this.chefProjet = chefProjet;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	public ChefProjet getChefProjet() {
		return chefProjet;
	}

	public void setChefProjet(ChefProjet chefProjet) {
		this.chefProjet = chefProjet;
	}

}
