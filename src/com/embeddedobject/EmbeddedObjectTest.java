package com.embeddedobject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nikesh.maharjan
 */
public class EmbeddedObjectTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmbeddedObjectPU");
        EntityManager em = factory.createEntityManager();

        EmbeddedObjectPU service = new EmbeddedObjectPU(em);

        Address a = new Address("Nepal", "Kathmandu", "Kirtipur");

        Mail mail = new Mail("This is the mail body, and it is very lengthy.......", a);
        service.addMail(mail);
    }

}
