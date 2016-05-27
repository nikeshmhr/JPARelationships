package com.onetoone;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author nikesh.maharjan
 */
@Entity
@Table(name = "O_O_PARKING")
public class Parking implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "PARKING_ID")
    private long id;

    @Column(name = "PARKING_SPACE")
    private String pSpace;

    @OneToOne(mappedBy = "space")
    private WorkingEmployee employee;

    public Parking() {
    }

    public Parking(String s) {
        this.pSpace = s;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getpSpace() {
        return pSpace;
    }

    public void setpSpace(String pSpace) {
        this.pSpace = pSpace;
    }

    public WorkingEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(WorkingEmployee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" + "id=" + id + ", space=" + pSpace + '}';
    }

}
