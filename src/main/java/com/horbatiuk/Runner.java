package com.horbatiuk;

import com.horbatiuk.data.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAUnit");
        EntityManager em = emf.createEntityManager();
        createRandomContacts(10, em);
    }

    /**
     * Creates randomly generated contacts in DB.
     *
     * @param number how many contacts to create
     * @param em what EntityManager to use
     *
     * @author  A.Horbatiuk
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
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return;
        }
    }
}
