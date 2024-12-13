package edu.badpals.model.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value="4")
@PrimaryKeyJoinColumn(name="idpersonal")
@Table(name = "limpiadores")
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
