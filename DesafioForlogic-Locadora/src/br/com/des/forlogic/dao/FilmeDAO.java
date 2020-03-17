/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.des.forlogic.dao;

import br.com.des.forlogic.model.Filme;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Stefanie
 */
public class FilmeDAO {
       
    private static FilmeDAO instance;
    protected EntityManager entityManager;
        
    public static FilmeDAO getInstance(){
        if (instance == null){
            instance = new FilmeDAO();
         }
          
         return instance;
       }
 
       private FilmeDAO() {
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
 
       public Filme getById(final int id) {
         return entityManager.find(Filme.class, id);
       }
 
       @SuppressWarnings("unchecked")
       public List<Filme> findAll() {
         return entityManager.createQuery("FROM " + 
         Filme.class.getName()).getResultList();
       }
 
       public void persist(Filme filme) {
         try {
            entityManager.getTransaction().begin();
            entityManager.persist(filme);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
       }
 
       public void merge(Filme filme) {
         try {
            entityManager.getTransaction().begin();
            entityManager.merge(filme);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
       }
 
       public void remove(Filme filme) {
         try {
            entityManager.getTransaction().begin();
            filme = entityManager.find(Filme.class, filme.getId());
            entityManager.remove(filme);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
       }
 
       public void removeById(final int id) {
         try {
            Filme filme = getById(id);
            remove(filme);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
       }
}

    
