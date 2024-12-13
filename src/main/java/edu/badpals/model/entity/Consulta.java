package edu.badpals.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="puerta")
    private String puerta;

    @ManyToOne
    @JoinColumn(name = "idPlanta")
    private Planta planta;

    @OneToOne(mappedBy = "consultaMedico")
    private Medico medico;

    @OneToOne(mappedBy = "consultaEnfermero")
    private Enfermero enfermero;

    public Consulta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
}
