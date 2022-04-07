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
import com.todo.list.models.MembreEquipe;
import com.todo.list.services.ChefProjetService;
import com.todo.list.services.MembreEquipeService;

@RestController
@RequestMapping(path = "/api/v1/membre/")
public class MembreController {

	private final MembreEquipeService membreService;
	
	@Autowired
    public MembreController(MembreEquipeService membreService) {
        this.membreService = membreService;
    }
	
	@GetMapping
    public List<MembreEquipe> findAll() {
        return this.membreService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<MembreEquipe> GetByID(@PathVariable int id) {
        return this.membreService.findById(id);
    }

    @PostMapping
    public MembreEquipe Add(@RequestBody MembreEquipe newMembre) {
        return this.membreService.save(newMembre);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.membreService.deleteById(id);
    }

    @PutMapping("/{id}")
    MembreEquipe Update(@RequestBody MembreEquipe newMembre) {
        return this.membreService.save(newMembre);
    }

}
