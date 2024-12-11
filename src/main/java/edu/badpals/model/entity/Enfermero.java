package edu.badpals.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@DiscriminatorValue(value="2")
public class Enfermero {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "consulta", nullable = false)
    private String consulta;
}