package com.todo.list.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TachePersonneKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2262122383157077807L;

	@Column(name = "tache_id")
	int tacheId;

	@Column(name = "membre_id")
	int membreEquipe;

}
