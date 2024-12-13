package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@DiscriminatorValue(value="2")
@PrimaryKeyJoinColumn(name="idpersonal")
public class Enfermero extends Personal{

    @OneToOne
    @JoinColumn(name = "consulta", nullable = true)
    private Consulta consultaEnfermero;

    @ManyToMany
    @JoinTable(name = "enfermeros_turnos",joinColumns =   @JoinColumn(name="idEnfermero"),
            inverseJoinColumns = @JoinColumn(name="idTurno"))
    private Set<Turno> lTurnosEnfermero;

    public Enfermero() {
    }

    public Consulta getConsultaEnfermero() {
        return consultaEnfermero;
    }

    public void setConsultaEnfermero(Consulta consulta) {
        this.consultaEnfermero = consulta;
    }

    public Set<Turno> getlTurnosEnfermero() {
        return lTurnosEnfermero;
    }

    public void setlTurnosEnfermero(Set<Turno> lTurnosEnfermero) {
        this.lTurnosEnfermero = lTurnosEnfermero;
    }
}