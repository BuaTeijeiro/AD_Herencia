package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.util.Set;

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

    @ManyToMany
    @JoinTable(name = "limpiadores_plantas",joinColumns =   @JoinColumn(name="idLimpiador"),
            inverseJoinColumns = @JoinColumn(name="idPlanta"))
    private Set<Planta> lPlantas;

    @ManyToMany
    @JoinTable(name = "limpiadores_turnos",joinColumns =   @JoinColumn(name="idLimpiador"),
            inverseJoinColumns = @JoinColumn(name="idTurno"))
    private Set<Turno> lTurnosLimpiador;

    public Set<Planta> getlPlantas() {
        return lPlantas;
    }

    public void setlPlantas(Set<Planta> lPlantas) {
        this.lPlantas = lPlantas;
    }

    public Set<Turno> getlTurnosLimpiador() {
        return lTurnosLimpiador;
    }

    public void setlTurnosLimpiador(Set<Turno> lTurnosLimpiador) {
        this.lTurnosLimpiador = lTurnosLimpiador;
    }
}