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
import com.todo.list.models.Tache;
import com.todo.list.services.SuiviService;
import com.todo.list.services.TacheService;

@RestController
@RequestMapping(path = "/api/v1/tache/")
public class TacheController {
	
	private final TacheService tacheService;
	
	@Autowired
    public TacheController(TacheService tacheService) {
        this.tacheService = tacheService;
    }
	
	@GetMapping
    public List<Tache> findAll() {
        return this.tacheService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tache> GetByID(@PathVariable int id) {
        return this.tacheService.findById(id);
    }

    @PostMapping
    public Tache Add(@RequestBody Tache newTache) {
        return this.tacheService.save(newTache);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.tacheService.deleteById(id);
    }

    @PutMapping("/{id}")
    Tache Update(@RequestBody Tache newTache) {
        return this.tacheService.save(newTache);
    }



}
