package com.todo.list.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("1")
public class ChefProjet extends Personne {
	
	@OneToMany( targetEntity=Projet.class, mappedBy="projet" )
    private List<Projet> projets = new ArrayList<>();


	
	
	public ChefProjet(Long id, String nom, String prenom, Date dateNaissance, String motDePasse, String email,
			String telephone, String fix) {
		super(id, nom, prenom, dateNaissance, motDePasse, email, telephone, fix);
		// TODO Auto-generated constructor stub
	}

	public ChefProjet(String nom, String prenom, Date dateNaissance, String motDePasse, String email, String telephone,
			String fix) {
		super(nom, prenom, dateNaissance, motDePasse, email, telephone, fix);
		// TODO Auto-generated constructor stub
	}

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	
	
	


}
