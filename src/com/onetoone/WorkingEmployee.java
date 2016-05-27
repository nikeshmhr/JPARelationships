package com.onetoone;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author nikesh.maharjan
 */
@Entity
@Table(name = "O_O_WORKING_EMPLOYEE")
public class WorkingEmployee implements Serializable {

    @Id
    @Column(name = "EMP_ID")
    @GeneratedValue
    private long id;

    @Column(name="EMP_NAME")
    private String name;

    @OneToOne
    @JoinColumn(name = "PARKING_ID")
    private Parking space;

    public WorkingEmployee() {

    }

    public WorkingEmployee(String name, Parking space) {
        this.name = name;
        this.space = space;
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

    public Parking getSpace() {
        return space;
    }

    public void setSpace(Parking space) {
        this.space = space;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", space=" + space + '}';
    }

}
