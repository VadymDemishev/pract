package com.skillsup.DAO.model;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private long id;

    public User() {
    }

    public User(String firstName, String lastName, int age, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
