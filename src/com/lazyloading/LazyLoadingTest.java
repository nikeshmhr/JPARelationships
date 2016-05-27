package com.lazyloading;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nikesh.maharjan
 */
public class LazyLoadingTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("LazyPersistenceUnit");
        EntityManager em = factory.createEntityManager();
        LazyLoadingService service = new LazyLoadingService(em);
        ParkingSpace space = new ParkingSpace("D");
        em.getTransaction().begin();
        em.persist(space);
        em.getTransaction().commit();

        Employee e = new Employee("Nikesh", space);

        service.insertEmployee(e);

        em.getTransaction().begin();
        List<Employee> employees = service.getEmployees();
        em.getTransaction().commit();

    }

}
