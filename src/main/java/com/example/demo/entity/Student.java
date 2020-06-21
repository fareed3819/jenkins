package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Student {
    @Id
    int id;
    @Column(name="roll_no")
    private  int rollno;
    @Column(name="name")
    private String name;
}
