package com.bontsi.development.familytree.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Gender")
    private char gender;

    @Column(name = "DateOfBirth")
    private Date dateOfBirth;

    @Column(name = "DateOfDeath")
    private Date dateOfDeath;

    @Column(name = "PlaceOfBirth")
    private String placeOfBirth;

    @Column(name = "PlaceOfDeath")
    private String placeOfDeath;

}
