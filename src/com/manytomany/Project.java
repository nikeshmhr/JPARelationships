package com.manytomany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author nikesh.maharjan
 */
@Entity
@Table(name = "M_N_PROJECT")
public class Project implements Serializable {

    @Id
    @Column(name = "PROJ_ID")
    @GeneratedValue
    private long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "DEV_PROJ",
            joinColumns = @JoinColumn(name = "PROJ_ID"),
            inverseJoinColumns = @JoinColumn(name = "DEV_ID"))
    private Collection<Developer> developers;

    public Project(String name, Collection<Developer> dev) {
        this.name = name;
        this.developers = dev;
    }

    public Project(String name) {
        this(name, new ArrayList<>());
    }

    public Project() {
        this("", new ArrayList<>());
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

    public Collection<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Collection<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + '}';
    }

}
