package com.horbatiuk;

import com.horbatiuk.data.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TransactionRequiredException;
import java.util.Random;

/**
 * Starts the program
 *
 * @author A.Horbatiuk
 */

public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAUnit");
        EntityManager em = emf.createEntityManager();
        createRandomContacts(10, em);
        em.close();
        emf.close();
    }

    /**
     * Creates randomly generated contacts in DB.
     *
     * @param number how many contacts to create
     * @param em     what EntityManager to use
     */

    private static void createRandomContacts(int number, EntityManager em) {
        Random r = new Random();
        em.getTransaction().begin();
        try {
            for (int i = 0; i < number; i++) {
                em.persist(new Contact().
                        setAge(r.nextInt(100)).
                        setFirstName("Name " + r.nextInt(number)).
                        setLastName("Last Name " + r.nextInt(number)).
                        setPhone(r.nextInt(9999999))
                );
            }
            em.getTransaction().commit();
        } catch (IllegalArgumentException | TransactionRequiredException | IllegalStateException e) {
            em.getTransaction().rollback();
            throw new TransactionRequiredException("Failed to write users to DB. Error message: " + e.getMessage());
        }
    }
}
