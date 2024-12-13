package edu.badpals.model.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value="3")
public class Celador extends Personal{
    @Column(name = "turno")
    private String turno;
    /*turnos*/

    public Celador() {
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
