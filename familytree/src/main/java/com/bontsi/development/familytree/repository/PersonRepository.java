package com.bontsi.development.familytree.repository;

import com.bontsi.development.familytree.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
