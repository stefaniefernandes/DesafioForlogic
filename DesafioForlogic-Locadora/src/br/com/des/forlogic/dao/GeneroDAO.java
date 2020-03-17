/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.des.forlogic.dao;

import br.com.des.forlogic.model.Genero;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Stefanie
 */
public class GeneroDAO {
    
    
     private static GeneroDAO instance;
       protected EntityManager entityManager;
        
       public static GeneroDAO getInstance(){
         if (instance == null){
            instance = new GeneroDAO();
         }
          
         return instance;
       }
 
       private GeneroDAO() {
         entityManager = getEntityManager();
       }
 
       private EntityManager getEntityManager() {
           EntityManagerFactory factory = 
        Persistence.createEntityManagerFactory("crudForlogic");
        if (entityManager == null) {
          entityManager = factory.createEntityManager();
        }
 
        return entityManager;
       }
 
       public Genero getById(final int id) {
         return entityManager.find(Genero.class, id);
       }
 
       @SuppressWarnings("unchecked")
       public List<Genero> findAll() {
         return entityManager.createQuery("FROM " + 
         Genero.class.getName()).getResultList();
       }
 
       public void persist(Genero genero) {
         try {
            entityManager.getTransaction().begin();
            entityManager.persist(genero);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
       }
 
       public void merge(Genero genero) {
         try {
            entityManager.getTransaction().begin();
            entityManager.merge(genero);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
       }
 
       public void remove(Genero genero) {
         try {
            entityManager.getTransaction().begin();
            genero = entityManager.find(Genero.class, genero.getId());
            entityManager.remove(genero);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
       }
 
       public void removeById(final int id) {
         try {
            Genero genero = getById(id);
            remove(genero);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
       }
}
