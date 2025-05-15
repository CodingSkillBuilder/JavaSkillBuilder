package com.cruiser.demo.service.impl;

import com.cruiser.demo.DTO.request.CreatePersonRequestDTO;
import com.cruiser.demo.DTO.response.PersonIdResponseDTO;
import com.cruiser.demo.DTO.response.SuccessablityResponseDTO;
import com.cruiser.demo.entity.Person;
import com.cruiser.demo.repo.PersonRepo;
import com.cruiser.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepo personRepo;


    @Override
    public PersonIdResponseDTO createPerson(CreatePersonRequestDTO createPersonRequestDTO) {

        Person person = new Person(
                createPersonRequestDTO.getName(),
                createPersonRequestDTO.getAge()
        );

        Person savedPerson = personRepo.save(person);

        return new PersonIdResponseDTO(savedPerson.getId());
    }
}
