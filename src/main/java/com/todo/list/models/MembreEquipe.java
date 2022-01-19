package com.todo.list.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("1")
public class MembreEquipe extends Personne {

	@OneToMany(mappedBy = "membreEquipe")
	Set<TachePersonne> tachePersonnes;

	public MembreEquipe(Long id, String nom, String prenom, Date dateNaissance, String motDePasse, String email,
			String telephone, String fix) {
		super(id, nom, prenom, dateNaissance, motDePasse, email, telephone, fix);
		// TODO Auto-generated constructor stub
	}

	public MembreEquipe(String nom, String prenom, Date dateNaissance, String motDePasse, String email,
			String telephone, String fix) {
		super(nom, prenom, dateNaissance, motDePasse, email, telephone, fix);
		// TODO Auto-generated constructor stub
	}

	public Set<TachePersonne> getTachePersonnes() {
		return tachePersonnes;
	}

	public void setTachePersonnes(Set<TachePersonne> tachePersonnes) {
		this.tachePersonnes = tachePersonnes;
	}

}
