package com.onetomany;

import javax.persistence.EntityManager;

/**
 *
 * @author nikesh.maharjan
 */
public class OneToManyPU {

    private EntityManager em;

    public OneToManyPU(EntityManager em) {
        this.em = em;
    }

    public void addGame(Game game) {
        em.getTransaction().begin();
        em.persist(game);
        em.getTransaction().commit();
    }

    public void addPlayer(Player p1) {
        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
    }

}
