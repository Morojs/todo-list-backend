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

import com.todo.list.models.Projet;
import com.todo.list.models.Suivi;
import com.todo.list.services.ProjetService;
import com.todo.list.services.SuiviService;

@RestController
@RequestMapping(path = "/api/v1/suivi/")
public class SuiviController {
	
	private final SuiviService suiviService;
	
	@Autowired
    public SuiviController(SuiviService suiviService) {
        this.suiviService = suiviService;
    }
	
	@GetMapping
    public List<Suivi> findAll() {
        return this.suiviService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Suivi> GetByID(@PathVariable int id) {
        return this.suiviService.findById(id);
    }

    @PostMapping
    public Suivi Add(@RequestBody Suivi newSuivi) {
        return this.suiviService.save(newSuivi);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id) {
        this.suiviService.deleteById(id);
    }

    @PutMapping("/{id}")
    Suivi Update(@RequestBody Suivi newSuivi) {
        return this.suiviService.save(newSuivi);
    }



}
