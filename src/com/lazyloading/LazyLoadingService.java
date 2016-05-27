package com.lazyloading;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author nikesh.maharjan
 */
public class LazyLoadingService {

    private EntityManager manager;

    public LazyLoadingService(EntityManager manager) {
        this.manager = manager;
    }

    public void insertEmployee(Employee e) {
        manager.getTransaction().begin();
        manager.persist(e);
        manager.getTransaction().commit();
    }

    public List<Employee> getEmployees() {
        TypedQuery<Employee> query = manager.createQuery("SELECT e FROM Employee e", Employee.class);
        return query.getResultList();
    }

}
