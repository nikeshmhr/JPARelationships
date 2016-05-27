package com.onetoone;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nikesh.maharjan
 */
public class OneToOneTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OneToOnePU");
        EntityManager em = factory.createEntityManager();

        OneToOnePU service = new OneToOnePU(em);

        /**
         * One to one unidirectional
         */
//        Parking parking = new Parking("LOT F");
//        service.addParking(parking);
//
//        WorkingEmployee employee = new WorkingEmployee("Nikesh Maharjan", parking);
//        service.addWorkingEmployee(employee);
        /**
         * Retrieving the working employee
         */
        List<WorkingEmployee> listOfEmployees = service.getAllEmployee();
        System.out.println("Debug Point");
    }

}
