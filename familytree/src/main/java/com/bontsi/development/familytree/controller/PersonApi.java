package com.bontsi.development.familytree.controller;

import com.bontsi.development.familytree.model.Person;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
public interface PersonApi {
    @GetMapping
    ResponseEntity<List<Person>> getAllPersons();
    @GetMapping("/{id}")
    ResponseEntity<Person> getPersonById(@PathVariable long id);
}
