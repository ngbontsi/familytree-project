package com.bontsi.development.familytree.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Table(name = "Person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personID;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "gender")
    private char gender;

    @Column(name = "dateofbirth")
    private Date dateOfBirth;

    @Column(name = "dateofdeath")
    private Date dateOfDeath;

    @Column(name = "placeofbirth")
    private String placeOfBirth;

    @Column(name = "placeofdeath")
    private String placeOfDeath;

}
