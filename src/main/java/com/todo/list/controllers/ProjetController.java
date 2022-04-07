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

import com.todo.list.models.Personne;
import com.todo.list.models.Projet;
import com.todo.list.services.PersonneService;
import com.todo.list.services.ProjetService;

@RestController
@RequestMapping(path = "/api/v1/projet/")
public class ProjetController {
	
	private final ProjetService projetService;
	
	@Autowired
    public ProjetController(ProjetService projetService) {
        this.projetService = projetService;
    }
	
	@GetMapping
    public List<Projet> findAll() {
        return this.projetService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Projet> GetByID(@PathVariable int id) {
        return this.projetService.findById(id);
    }

    @PostMapping
    public Projet Add(@RequestBody Projet newProjet) {
        return this.projetService.save(newProjet);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.projetService.deleteById(id);
    }

    @PutMapping("/{id}")
    Projet Update(@RequestBody Projet newProjet) {
        return this.projetService.save(newProjet);
    }



}
