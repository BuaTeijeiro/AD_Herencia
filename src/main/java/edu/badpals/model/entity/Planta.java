package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="plantas")
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="planta")
    private int planta;

    @OneToMany(mappedBy = "planta")
    private Set<Consulta> consultas;

    @ManyToMany(mappedBy = "lPlantas")
    private Set<Limpiador> limpiadores;

    public Planta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public Set<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Set<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Set<Limpiador> getLimpiadores() {
        return limpiadores;
    }

    public void setLimpiadores(Set<Limpiador> limpiadores) {
        this.limpiadores = limpiadores;
    }
}
