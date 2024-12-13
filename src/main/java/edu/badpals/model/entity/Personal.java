package edu.badpals.model.entity;

import com.sun.istack.Nullable;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_persona",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value="0")

public class Personal {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "dni", length = 9)
    @Nullable
    private String dni;
    @Column(name = "nss")
    @Nullable
    private String nss;
    @Column(name = "direccion")
    @Nullable
    private String direccion;
    @Column(name = "nombre")
    @Nullable
    private String nombre;
    @Column(name="telefono")
    @Nullable
    private String telefono;

    public Personal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}