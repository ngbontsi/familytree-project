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
    ResponseEntity<Person> getPersonById(@PathVariable(value = "id") long personId);
    @PostMapping()
    Person  addPerson( @RequestBody  Person person);
    @PutMapping("/{id}")
    ResponseEntity<Person> updatePerson(@PathVariable(value = "id") long personId, @RequestBody Person person);
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deletePerson(@PathVariable(value = "id") long personId);
}
