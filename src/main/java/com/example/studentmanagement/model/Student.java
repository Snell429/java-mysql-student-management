package com.example.studentmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private int age;

    @Column(name = "class_id")
    private int classId;

    public Student() {}

    public Student(String name, String email, int age, int classId) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.classId = classId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public int getClassId() { return classId; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setAge(int age) { this.age = age; }
    public void setClassId(int classId) { this.classId = classId; }
}