package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@DiscriminatorValue(value="3")
@Table(name="celadores")
@PrimaryKeyJoinColumn(name="idpersonal")
public class Celador extends Personal{
    @Column(name = "turno")
    private String turno;

    @ManyToMany
    @JoinTable(name = "celadores_turnos",joinColumns =   @JoinColumn(name="idCelador"),
            inverseJoinColumns = @JoinColumn(name="idTurno"))
    private Set<Turno> lTurnosCelador;

    public Celador() {
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Set<Turno> getlTurnosCelador() {
        return lTurnosCelador;
    }

    public void setlTurnosCelador(Set<Turno> lTurnosCelador) {
        this.lTurnosCelador = lTurnosCelador;
    }
}
