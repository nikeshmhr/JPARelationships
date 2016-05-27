package com.onetoone;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author nikesh.maharjan
 */
public class OneToOnePU {

    private EntityManager em;

    public OneToOnePU(EntityManager em) {
        this.em = em;
    }

    public void addWorkingEmployee(WorkingEmployee e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }

    public void addParking(Parking p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public List<WorkingEmployee> getAllEmployee() {
        Query q = em.createQuery("SELECT we FROM WorkingEmployee we", WorkingEmployee.class);

        return q.getResultList();
    }

}
