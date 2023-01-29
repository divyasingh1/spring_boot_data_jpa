package com.example.demo;

import javax.persistence.*;

@Entity(name="Student")
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "Student_sequence",
            sequenceName = "Student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Student_sequence"

    )

    @Column(name="id", updatable = false)
    private Long id;

    @Column(name = "firstName", updatable = true,  nullable = false, columnDefinition = "TEXT")
    private String firstName;
    @Column(name = "lastName", updatable = true,  nullable = false, columnDefinition = "TEXT")
    private String lastName;
    @Column(name = "email", updatable = true,  nullable = false, columnDefinition = "TEXT", unique = true)
    private String email;
    @Column(name = "age", updatable = true, nullable = false)
    private Integer age;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String email, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
