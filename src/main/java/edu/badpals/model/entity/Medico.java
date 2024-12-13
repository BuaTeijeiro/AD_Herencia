package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue(value="1")
@PrimaryKeyJoinColumn(name="idpersonal")
public class Medico extends Personal {
    @Column(name = "consultaVisita")
    private String consultaVisita;
     /*@Column(name = "operaciones")
    private List<String> operaciones;
    @Column(name = "visitas")
    private List<String> visitas;*/

    public Medico() {
        super();
    }

    public String getConsultaVisita() {
        return consultaVisita;
    }

    public void setConsultaVisita(String consultaVisita) {
        this.consultaVisita = consultaVisita;
    }

    // descripcion y fecha asociada a las consultas y visitas?
}
