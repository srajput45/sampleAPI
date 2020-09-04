package com.example.sample.sample.model;

import javax.persistence.*;

@Entity
@Table(name = "username")
public class Username {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private long id;
    private String name;
    private  String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
