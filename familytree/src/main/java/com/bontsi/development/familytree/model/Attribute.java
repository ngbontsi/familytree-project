package com.bontsi.development.familytree.model;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name = "Attribute")
@Data
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attributeID;

    @Column(name = "PersonID")
    private Long personID;

    @Column(name = "AttributeType")
    private String attributeType;

    @Column(name = "Value")
    private String value;


}

