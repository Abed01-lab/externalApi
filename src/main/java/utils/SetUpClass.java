/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entities.Flight;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author abed
 */
public class SetUpClass {
    public static void main(String[] args) {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        
        Flight flight = new Flight("Copenhagen", "Barcelona", "", "", 123523);
        
        try{
            em.getTransaction().begin();
            em.persist(flight);
            em.getTransaction().commit();
        } finally{
            em.close();
        }
        
    }
}
