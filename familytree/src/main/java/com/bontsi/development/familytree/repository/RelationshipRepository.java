package com.bontsi.development.familytree.repository;

import com.bontsi.development.familytree.model.Person;
import com.bontsi.development.familytree.model.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationshipRepository extends JpaRepository<Relationship,Long> {
}
