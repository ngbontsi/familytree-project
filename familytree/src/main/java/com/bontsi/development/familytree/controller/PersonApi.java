package com.bontsi.development.familytree.controller;

import com.bontsi.development.familytree.model.Person;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api/persons", produces = MediaType.APPLICATION_JSON_VALUE)
public interface PersonApi {
    @GetMapping
    ResponseEntity<List<Person>> getAllPersons();
    @GetMapping("/{id}")
    ResponseEntity<Person> getPersonById(@PathVariable long id);
    @PostMapping()
    void addPerson(@PathVariable Person person);
    @PutMapping("/{id}")
    void updatePerson(@PathVariable long id,Person person);
    @DeleteMapping("/{id}")
    void deletePerson(@PathVariable long id);
}
