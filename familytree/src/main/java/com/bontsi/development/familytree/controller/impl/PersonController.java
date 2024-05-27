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
    public ResponseEntity<Person> getPersonById(long personId) {
        Person person = personRepository.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found with id: " + personId));
        return ResponseEntity.ok().body(person);
    }

    @Override
    public Person  addPerson(Person person) {
       return personRepository.save(person);
    }

    @Override
    public ResponseEntity<Person>  updatePerson(long personId, Person personDetails) {

        Person person = personRepository.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found for this id :: " + personId));

        person.setFirstName(personDetails.getFirstName());
        person.setLastName(personDetails.getLastName());
        person.setDateOfBirth(personDetails.getDateOfBirth());

        final Person updatedPerson = personRepository.save(person);
        return ResponseEntity.ok(updatedPerson);
    }
    @Override
    public  ResponseEntity<Void> deletePerson(long personId) {
        Person person = personRepository.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found for this id :: " + personId));

        personRepository.delete(person);
        return ResponseEntity.noContent().build();
    }
}
