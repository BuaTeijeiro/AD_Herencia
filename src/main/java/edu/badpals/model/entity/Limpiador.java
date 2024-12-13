package edu.badpals.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@DiscriminatorValue(value="4")
public class Limpiador extends Personal {
    @Column(name="planta")
    private String planta;

    /*turnos*/

    public Limpiador() {
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }
}
