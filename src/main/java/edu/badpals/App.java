package edu.badpals;

import edu.badpals.model.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        Medico medico = new Medico();
        medico.setId(1);
        medico.setConsultaVisita("Consulta médico");

        Enfermero enfermero = new Enfermero();
        enfermero.setId(2);
        enfermero.setConsulta("Consulta enfermero");

        Celador celador = new Celador();
        celador.setId(3);
        celador.setTurno("Mañana");

        Limpiador limpiador = new Limpiador();
        limpiador.setId(4);
        limpiador.setPlanta("Primera");

        Personal personal = new Personal();
        personal.setId(5);
        personal.setNombre("pepe");


        try{
            em.getTransaction().begin();
            em.persist(medico);
            em.persist(enfermero);
            em.persist(celador);
            em.persist(limpiador);
            em.persist(personal);
            em.getTransaction().commit();
        } catch (PersistenceException e) {
            System.out.println("Error" + e.getMessage());
        }

        em.close();
        emf.close();

    }
}
