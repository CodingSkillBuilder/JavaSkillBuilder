package com.cruiser.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data

public class Person {
//    private static int Id = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;


//    public Person(String name, int age){
//        id = Id++;
//        this.name = name;
//        this.age = age;
//    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
