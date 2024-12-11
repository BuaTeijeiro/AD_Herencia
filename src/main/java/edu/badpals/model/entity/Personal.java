package edu.badpals.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="personas")
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
