package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="paciente")
    private String nombrePaciente;

    @ManyToOne
    @JoinColumn(name = "idMedico")
    private Medico medico;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="tipo")
    private TipoCita tipo;

    private enum TipoCita {
        VISITA, operación;
    }

    public Cita() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoCita getTipo() {
        return tipo;
    }

    public void setTipo(TipoCita tipo) {
        this.tipo = tipo;
    }
}


