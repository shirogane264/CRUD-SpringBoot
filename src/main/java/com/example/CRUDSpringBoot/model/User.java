package com.example.CRUDSpringBoot.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    public User() {
    }

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }


}