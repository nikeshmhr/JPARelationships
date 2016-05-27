package com.lazyloading;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author nikesh.maharjan
 */
@Entity
@Table(name = "PARKING_SPACE_LAZY")
public class ParkingSpace implements Serializable {

    @Id
    @Column(name = "PARKING_ID")
    @GeneratedValue
    private long id;

    @Column(name = "PARKING_NAME")
    private String name;

    public ParkingSpace() {

    }

    public ParkingSpace(String name) {
        this.name = name;
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

}
