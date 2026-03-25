package com.example.studentmanagement.model;

import java.sql.Date;

public class StudentFullInfo {

    private String name;
    private String email;
    private int age;
    private String className;
    private String course;
    private Date startDate;
    private Date endDate;

    public StudentFullInfo(String name, String email, int age,
                           String className, String course,
                           Date startDate, Date endDate) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.className = className;
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getClassName() { return className; }
    public String getCourse() { return course; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
}