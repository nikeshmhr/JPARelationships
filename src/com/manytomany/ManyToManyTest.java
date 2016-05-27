package com.manytomany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nikesh.maharjan
 */
public class ManyToManyTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ManyToManyPU");
        EntityManager em = factory.createEntityManager();

        ManyToManyPU service = new ManyToManyPU(em);

//        Developer d1 = new Developer("nikesh");
//        Developer d2 = new Developer("suresh");
//        Developer d3 = new Developer("sandesh");
//
//        service.addDeveloper(d1);
//        service.addDeveloper(d2);
//        service.addDeveloper(d3);
//
//        Set<Developer> devSet1 = new HashSet<>();
//        devSet1.add(d1);
//        devSet1.add(d2);
//        devSet1.add(d3);
//
//        Set<Developer> devSet2 = new HashSet<>();
//        devSet2.add(d2);
//        devSet2.add(d1);
//        devSet2.add(d3);
//
//        Set<Developer> devSet3 = new HashSet<>();
//        devSet3.add(d3);
//        devSet3.add(d2);
//        devSet3.add(d1);
//
//        Project p1 = new Project("Proj 1", devSet3);
//        Project p2 = new Project("Proj 2", devSet1);
//        Project p3 = new Project("Proj 3", devSet2);
//
//        service.addProject(p1);
//        service.addProject(p2);
//        service.addProject(p3);

        // selecting from database
        List<Project> listOfProjects = service.getAllProjects();
        System.out.println("Size of projects: " + listOfProjects.size());
        System.out.println("DEBUG POINT");
    }

}
