package com.bontsi.development.familytree.controller.impl;

import com.bontsi.development.familytree.Exception.ResourceNotFoundException;
import com.bontsi.development.familytree.controller.PersonApi;
import com.bontsi.development.familytree.model.Person;
import com.bontsi.development.familytree.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController implements PersonApi {

    @Autowired
    private PersonRepository personRepository;
    @Override
    public ResponseEntity<List<Person>> getAllPersons() {
         List<Person> all = personRepository.findAll();
        return ResponseEntity.ok().body(all);
    }

    @Override
    public ResponseEntity<Person> getPersonById(long id) {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found with id: " + id));
        return ResponseEntity.ok().body(person);
    }
}
