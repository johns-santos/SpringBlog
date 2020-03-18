package com.codeup.europa.springblog.models.javax.persistence;

import javax.persistence.*;

@Entity
@Table(name = "dogs")
public class Dogs {

    // PRIMARY KEY ====================== //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "INIT(11)  UNSIGNED")
    private long id;

    // UNIQUE KEY ====================== //
    @Column(unique = true, nullable = false, length = 3)
    private String age;

    @Column(nullable = false, length = 200)
    private String name;


    @Column(nullable = false, length = 2)
    private String reside_state;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReside_state() {
        return reside_state;
    }

    public void setReside_state(String reside_state) {
        this.reside_state = reside_state;
    }
}

