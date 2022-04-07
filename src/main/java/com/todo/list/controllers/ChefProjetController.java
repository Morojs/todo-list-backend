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

import com.todo.list.models.ChefProjet;
import com.todo.list.services.ChefProjetService;
import com.todo.list.services.ProjetService;

@RestController
@RequestMapping(path = "/api/v1/chefProjet/")
public class ChefProjetController {
	
	private final ChefProjetService chefProjetService;
	
	@Autowired
    public ChefProjetController(ChefProjetService chefProjetService) {
        this.chefProjetService = chefProjetService;
    }
	
	@GetMapping
    public List<ChefProjet> findAll() {
        return this.chefProjetService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ChefProjet> GetByID(@PathVariable int id) {
        return this.chefProjetService.findById(id);
    }

    @PostMapping
    public ChefProjet Add(@RequestBody ChefProjet newChefProjet) {
        return this.chefProjetService.save(newChefProjet);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.chefProjetService.deleteById(id);
    }

    @PutMapping("/{id}")
    ChefProjet Update(@RequestBody ChefProjet newChefProjet) {
        return this.chefProjetService.save(newChefProjet);
    }

}
