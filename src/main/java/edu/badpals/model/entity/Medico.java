package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue(value="1")
public class Medico {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "consultaVisita")
    private String consultaVisita;
    @Column(name = "operaciones")
    private List<String> operaciones;
    @Column(name = "visitas")
    private List<String> visitas;

    // descripcion y fecha asociada a las consultas y visitas?
}
