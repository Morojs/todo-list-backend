package com.todo.list.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tache {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String libelle;
	private Date dateCreation;
	private String description;
	private Date dateEcheance;
	private String etat;

	@ManyToOne
	@JoinColumn(name = "idProjet", nullable = false)
	private Projet projet;

	@OneToMany(targetEntity = Suivi.class, mappedBy = "suivi")
	private List<Tache> suivis = new ArrayList<>();

	@OneToMany(mappedBy = "tache")
	Set<TachePersonne> tachePersonnes;

	public Tache(int id, String libelle, Date dateCreation, String description, Date dateEcheance, String etat,
			Projet projet, List<Tache> suivis, Set<TachePersonne> tachePersonnes) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.dateCreation = dateCreation;
		this.description = description;
		this.dateEcheance = dateEcheance;
		this.etat = etat;
		this.projet = projet;
		this.suivis = suivis;
		this.tachePersonnes = tachePersonnes;
	}

	public Tache(String libelle, Date dateCreation, String description, Date dateEcheance, String etat, Projet projet,
			List<Tache> suivis, Set<TachePersonne> tachePersonnes) {
		super();
		this.libelle = libelle;
		this.dateCreation = dateCreation;
		this.description = description;
		this.dateEcheance = dateEcheance;
		this.etat = etat;
		this.projet = projet;
		this.suivis = suivis;
		this.tachePersonnes = tachePersonnes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public List<Tache> getSuivis() {
		return suivis;
	}

	public void setSuivis(List<Tache> suivis) {
		this.suivis = suivis;
	}

	public Set<TachePersonne> getTachePersonnes() {
		return tachePersonnes;
	}

	public void setTachePersonnes(Set<TachePersonne> tachePersonnes) {
		this.tachePersonnes = tachePersonnes;
	}

}
