package com.manytomany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
@Table(name = "M_N_DEVELOPER")
public class Developer implements Serializable {

    @Id
    @Column(name = "DEVELOPER_ID")
    @GeneratedValue
    private long id;

    private String name;

    @ManyToMany(mappedBy = "developers")
    private Collection<Project> projects;

    public Developer(String name, List<Project> proj) {
        this.name = name;
        this.projects = proj;
    }

    public Developer(String name) {
        this(name, new ArrayList<>());
    }

    public Developer() {
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

    public Collection<Project> getProjects() {
        return projects;
    }

    public void setProjects(Collection<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Developer{" + "name=" + name + ", projects=" + projects + '}';
    }

}
