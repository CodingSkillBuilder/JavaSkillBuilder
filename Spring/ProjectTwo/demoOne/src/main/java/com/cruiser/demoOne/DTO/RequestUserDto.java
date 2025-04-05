package com.cruiser.demoOne.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// this stands for Data transfer object...
// so ...a long story short, DTO class is what sits between the controller layer and the service layer...
// in this example we use the same attributes that we used int eh  user entity implying that all what should reach that layer should come from this layer...
//but as you can imagine it sould not be this way at all (would change in most of the cases)
//So mind that we create mutiple DTOs as we need them....
@NoArgsConstructor
@AllArgsConstructor
@Data

public class RequestUserDto {
    private int id;
    private String username;
    private String password;
}
