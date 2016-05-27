package com.manytoone;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author nikesh.maharjan
 */
public class ManyToOneSingleValuePU {

    private EntityManager em;

    public ManyToOneSingleValuePU(EntityManager em) {
        this.em = em;
    }

    public void addPerson(Person person) {
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
    }

    public void addPhone(Phone phone) {
        em.getTransaction().begin();
        em.persist(phone);
        em.getTransaction().commit();
    }

    public Person findPersonById(long id) {
        em.getTransaction().begin();

        TypedQuery<Person> q = em.createNamedQuery("find by id", Person.class);
        q.setParameter("id", id);
        Person p = q.getSingleResult();
        em.getTransaction().commit();

        return p;
    }

    public List<Person> finddAllPerson() {
        Query q = em.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> listOfPerson = q.getResultList();
        return listOfPerson;
    }

    public List<Phone> findAllPhones() {
        Query q = em.createQuery("SELECT ph FROM Phone ph", Phone.class);
        List<Phone> listOfPhones = q.getResultList();
        return listOfPhones;
    }

}
