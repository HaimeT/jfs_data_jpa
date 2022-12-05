package com.example.jfs_data_jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    //Instance
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     Long id;
     String name;
// Two Constructors
    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
// getters and setters for all of instance fields.
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
// toString method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
