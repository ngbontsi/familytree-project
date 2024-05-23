package com.bontsi.development.familytree.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Table(name = "Event")
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventID;

    @Column(name = "PersonID")
    private Long personID;

    @Column(name = "EventType")
    private String eventType;

    @Column(name = "EventDate")
    private Date eventDate;

    @Column(name = "Location")
    private String location;

    @Column(name = "Description")
    private String description;

    // Getters and setters
}

