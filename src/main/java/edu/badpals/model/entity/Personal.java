package edu.badpals.model.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_persona",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value="0")

public class Personal {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "dni", length = 9)
    private String dni;
    @Column(name = "nss")
    private String nss;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "nombre")
    private String nombre;
    @Column(name="telefono")
    private String telefono;

}