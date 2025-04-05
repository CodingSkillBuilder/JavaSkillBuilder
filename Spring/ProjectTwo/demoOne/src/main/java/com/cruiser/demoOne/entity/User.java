package com.cruiser.demoOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Mind that these classes are made to represent the tables
@Entity  //this is the springs own way of letting java know that this is a table
@AllArgsConstructor
@NoArgsConstructor
@Data //adding getters and setters (Lombok)


//so mind that both DTO s and Entity layers are kind of like vehicles that are used to travel data between layers.

public class User {
    @Id //let spring know that this is the primary key

    // there are more annotations to do auto incrementing and more...
    private int id;
    private String username;
    private String password;
}
