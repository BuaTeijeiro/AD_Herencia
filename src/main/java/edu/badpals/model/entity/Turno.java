package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "hora_entrada")
    private String horaEntrada;

    @Column(name = "hora_salida")
    private String horaSalida;

    @Column(name= "num_horas")
    private int numHoras;

    @ManyToMany(mappedBy = "lTurnosCelador")
    private Set<Celador> celadores;

    @ManyToMany(mappedBy = "lTurnosEnfermero")
    private Set<Enfermero> enfermeros;

    @ManyToMany(mappedBy = "lTurnosLimpiador")
    private Set<Limpiador> limpiadores;

    public Turno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public Set<Celador> getCeladores() {
        return celadores;
    }

    public void setCeladores(Set<Celador> celadores) {
        this.celadores = celadores;
    }

    public Set<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(Set<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }

    public Set<Limpiador> getLimpiadores() {
        return limpiadores;
    }

    public void setLimpiadores(Set<Limpiador> limpiadores) {
        this.limpiadores = limpiadores;
    }
}
