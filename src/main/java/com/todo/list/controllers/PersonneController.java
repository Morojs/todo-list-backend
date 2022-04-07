package com.todo.list.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.models.MembreEquipe;
import com.todo.list.models.Personne;
import com.todo.list.services.MembreEquipeService;
import com.todo.list.services.PersonneService;

@RestController
@RequestMapping(path = "/api/v1/personne/")
public class PersonneController {

	private final PersonneService personneService;
	
	@Autowired
    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }
	
	@GetMapping
    public List<Personne> findAll() {
        return this.personneService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Personne> GetByID(@PathVariable int id) {
        return this.personneService.findById(id);
    }

    @PostMapping
    public Personne Add(@RequestBody Personne newPersonne) {
        return this.personneService.save(newPersonne);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.personneService.deleteById(id);
    }

    @PutMapping("/{id}")
    Personne Update(@RequestBody Personne newPersonne) {
        return this.personneService.save(newPersonne);
    }



}
