package edu.badpals.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@DiscriminatorValue(value="2")
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