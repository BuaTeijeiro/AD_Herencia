package edu.badpals.model.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value="2")
@PrimaryKeyJoinColumn(name="idpersonal")
public class Enfermero extends Personal{
    @Column(name = "consulta", nullable = true)
    private String consulta;
    /* turnos*/

    public Enfermero() {
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
}