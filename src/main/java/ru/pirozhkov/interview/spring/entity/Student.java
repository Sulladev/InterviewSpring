package ru.pirozhkov.interview.spring.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 32, nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;


    public Student(String name, int mark) {
        this.name = name;
        this.age = age;
    }
}
