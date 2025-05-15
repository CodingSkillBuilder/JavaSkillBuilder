package com.cruiser.demo.service;

import com.cruiser.demo.DTO.request.CreatePersonRequestDTO;
import com.cruiser.demo.DTO.response.PersonIdResponseDTO;
import com.cruiser.demo.DTO.response.SuccessablityResponseDTO;

public interface PersonService {


    public PersonIdResponseDTO createPerson(CreatePersonRequestDTO createPersonRequestDTO);
}
