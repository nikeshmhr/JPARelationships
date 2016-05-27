package com.manytoone;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nikesh.maharjan
 */
public class ManyToOneTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ManyToOneSingleValuePU");
        EntityManager em = factory.createEntityManager();

        ManyToOneSingleValuePU service = new ManyToOneSingleValuePU(em);
        //        Person person = new Person("Nikesh mhr");
        //        service.addPerson(person);

        //        Phone phone = new Phone("89813478414", person);
        //        service.addPhone(phone);
        //        Person pe = service.findPersonById(51);
        //        service.addPhone(new Phone("11123213", pe));
               
        // Display thingy
        List<Person> persons = service.finddAllPerson();

        List<Phone> phones = service.findAllPhones();

        System.out.println("DEBUG POINT.");
    }

}
