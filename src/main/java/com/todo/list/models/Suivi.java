package com.todo.list.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Suivi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date dateSuivi;
	private String description;

	@ManyToOne
	@JoinColumn(name = "idTache", nullable = false)
	private Tache tache;

	public Suivi(int id, Date dateSuivi, String description, Tache tache) {
		super();
		this.id = id;
		this.dateSuivi = dateSuivi;
		this.description = description;
		this.tache = tache;
	}

	public Suivi(Date dateSuivi, String description, Tache tache) {
		super();
		this.dateSuivi = dateSuivi;
		this.description = description;
		this.tache = tache;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateSuivi() {
		return dateSuivi;
	}

	public void setDateSuivi(Date dateSuivi) {
		this.dateSuivi = dateSuivi;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

}
