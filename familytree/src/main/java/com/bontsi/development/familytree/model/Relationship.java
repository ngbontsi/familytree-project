package com.bontsi.development.familytree.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Relationship")
@Data
public class Relationship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relationshipID;

    @Column(name = "Person1_ID")
    private Long person1ID;

    @Column(name = "Person2_ID")
    private Long person2ID;

    @Column(name = "RelationshipType")
    private String relationshipType;
}

