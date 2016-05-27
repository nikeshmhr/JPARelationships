package com.embeddedobject;

import javax.persistence.EntityManager;

/**
 *
 * @author nikesh.maharjan
 */
public class EmbeddedObjectPU {

    private EntityManager em;

    public EmbeddedObjectPU(EntityManager em) {
        this.em = em;
    }
    
    public void addMail(Mail mail){
        em.getTransaction().begin();
        em.persist(mail);
        em.getTransaction().commit();
    }

}
