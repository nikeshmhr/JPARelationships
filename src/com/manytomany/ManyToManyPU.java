package com.manytomany;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author nikesh.maharjan
 */
public class ManyToManyPU {

    private EntityManager em;

    public ManyToManyPU(EntityManager em) {
        this.em = em;
    }

    public void addDeveloper(Developer dev) {
        em.getTransaction().begin();
        em.persist(dev);
        em.getTransaction().commit();
    }

    public void addProject(Project proj) {
        em.getTransaction().begin();
        em.persist(proj);
        em.getTransaction().commit();
    }

    public List<Project> getAllProjects() {
        Query q = em.createQuery("SELECT p FROM Project p", Project.class);

        return q.getResultList();
    }

}
