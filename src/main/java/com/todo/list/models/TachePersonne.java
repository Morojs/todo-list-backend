package com.todo.list.models;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class TachePersonne {

	@EmbeddedId
	TachePersonneKey id;

	@ManyToOne
	@MapsId("tacheId")
	@JoinColumn(name = "tache_id")
	Tache tache;

	@ManyToOne
	@MapsId("membre_id")
	@JoinColumn(name = "membre_id")
	MembreEquipe membreEquipe;

	private Date dateDebut;
	private Date dateFin;
	private String etatAvanacement;

	public TachePersonne() {
		super();
	}

	public TachePersonne(TachePersonneKey id, Tache tache, MembreEquipe membreEquipe, Date dateDebut, Date dateFin,
			String etatAvanacement) {
		super();
		this.id = id;
		this.tache = tache;
		this.membreEquipe = membreEquipe;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatAvanacement = etatAvanacement;
	}

	public TachePersonne(Tache tache, MembreEquipe membreEquipe, Date dateDebut, Date dateFin, String etatAvanacement) {
		super();
		this.tache = tache;
		this.membreEquipe = membreEquipe;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatAvanacement = etatAvanacement;
	}

	public TachePersonneKey getId() {
		return id;
	}

	public void setId(TachePersonneKey id) {
		this.id = id;
	}

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

	public MembreEquipe getMembreEquipe() {
		return membreEquipe;
	}

	public void setMembreEquipe(MembreEquipe membreEquipe) {
		this.membreEquipe = membreEquipe;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtatAvanacement() {
		return etatAvanacement;
	}

	public void setEtatAvanacement(String etatAvanacement) {
		this.etatAvanacement = etatAvanacement;
	}

}
