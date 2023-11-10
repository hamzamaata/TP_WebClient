package service;

import java.util.List;

import entities.Filiere;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Stateless
public class FiliereService {
    @PersistenceContext
    private EntityManager entityManager;

    public Filiere createFiliere(Filiere filiere) {
        entityManager.persist(filiere);
        return filiere;
    }

    public Filiere updateFiliere(Filiere filiere) {
        return entityManager.merge(filiere);
    }

    public void deleteFiliere(Long filiereId) {
        Filiere filiere = entityManager.find(Filiere.class, filiereId);
        if (filiere != null) {
            entityManager.remove(filiere);
        }
    }

    public List<Filiere> getAllFilieres() {
        TypedQuery<Filiere> query = entityManager.createQuery("SELECT f FROM Filiere f", Filiere.class);
        return query.getResultList();
    }

    public Filiere getFiliereById(Long filiereId) {
        return entityManager.find(Filiere.class, filiereId);
    }
}