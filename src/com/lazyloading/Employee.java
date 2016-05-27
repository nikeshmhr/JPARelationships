package com.lazyloading;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "EMP_LAZY")
public class Employee implements Serializable {

    @Id
    @Column(name = "EMP_ID")
    @GeneratedValue
    private long id;

    @Column(name = "EMP_NAME")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARKING_ID")
    private ParkingSpace parking;

    public Employee() {
    }

    public Employee(String name, ParkingSpace space) {
        this.name = name;
        this.parking = space;
    }

}
