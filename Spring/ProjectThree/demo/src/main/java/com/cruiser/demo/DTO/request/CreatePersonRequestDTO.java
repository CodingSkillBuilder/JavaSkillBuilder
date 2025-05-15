package com.cruiser.demo.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CreatePersonRequestDTO {
    private String name;
    private int age;
}
