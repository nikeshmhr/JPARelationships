package com.manytoone;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author nikesh.maharjan
 */
@Entity
@Table(name = "M_One_Phone")
public class Phone implements Serializable {

    @Id
    @Column(name = "PHONE_ID")
    @GeneratedValue
    private long id;

    @Column(name = "PHONE_NO", nullable = false)
    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    public Phone() {
    }

    public Phone(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", number=" + number + ", person=" + person + '}';
    }

}
