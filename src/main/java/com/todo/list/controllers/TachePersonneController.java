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

import com.todo.list.models.Suivi;
import com.todo.list.models.TachePersonne;
import com.todo.list.services.SuiviService;
import com.todo.list.services.TachePersonneService;

@RestController
@RequestMapping(path = "/api/v1/tachePersonne/")
public class TachePersonneController {
	
	private final TachePersonneService tachePersonneService;
	
	@Autowired
    public TachePersonneController(TachePersonneService tachePersonneService) {
        this.tachePersonneService = tachePersonneService;
    }
	
	@GetMapping
    public List<TachePersonne> findAll() {
        return this.tachePersonneService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TachePersonne> GetByID(@PathVariable int id) {
        return this.tachePersonneService.findById(id);
    }

    @PostMapping
    public TachePersonne Add(@RequestBody TachePersonne newTachePersonne) {
        return this.tachePersonneService.save(newTachePersonne);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.tachePersonneService.deleteById(id);
    }

    @PutMapping("/{id}")
    TachePersonne Update(@RequestBody TachePersonne newTachePersonne) {
        return this.tachePersonneService.save(newTachePersonne);
    }



}
