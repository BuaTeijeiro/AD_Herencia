package edu.badpals.model.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@DiscriminatorValue(value="1")
@PrimaryKeyJoinColumn(name="idpersonal")
public class Medico extends Personal {

    @OneToOne
    @JoinColumn(name = "consulta")
    private Consulta consultaMedico;

    @OneToMany(mappedBy = "medico")
    private Set<Cita> citas;


    public Medico() {
        super();
    }

    public Consulta getConsultaVisita() {
        return consultaMedico;
    }

    public void setConsultaVisita(Consulta consultaVisita) {
        this.consultaMedico = consultaVisita;
    }

    public Consulta getConsultaMedico() {
        return consultaMedico;
    }

    public void setConsultaMedico(Consulta consultaMedico) {
        this.consultaMedico = consultaMedico;
    }

    public Set<Cita> getCitas() {
        return citas;
    }

    public void setCitas(Set<Cita> citas) {
        this.citas = citas;
    }
}
