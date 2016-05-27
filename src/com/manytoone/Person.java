package com.manytoone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author nikesh.maharjan
 */
@Entity
@Table(name = "M_One_PERSON")
@NamedQuery(name = "find by id", query = "SELECT p FROM Person p WHERE p.id=:id")
public class Person implements Serializable {

    @Id
    @Column(name = "PERSON_ID")
    @GeneratedValue
    private long id;

    @Column(name = "PERSON_NAME")
    private String name;

    // for bidirectional mapping
//    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
//    private Collection<Phone> phones;

    public Person() {
        this("");
    }

    public Person(String name) {
        this.name = name;
//        phones = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Collection<Phone> getPhones() {
//        return phones;
//    }
//
//    public void setPhones(Collection<Phone> phones) {
//        this.phones = phones;
//    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + "}";
    }

}
