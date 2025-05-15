package com.cruiser.demo.controller;

import com.cruiser.demo.DTO.request.CreatePersonRequestDTO;
import com.cruiser.demo.DTO.response.PersonIdResponseDTO;
import com.cruiser.demo.service.PersonService;
import com.cruiser.demo.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cat")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/createPerson")
    public ResponseEntity<StandardResponse> savePerson(@RequestBody CreatePersonRequestDTO createPersonRequestDTO){

        PersonIdResponseDTO personIdResponseDTO = personService.createPerson(createPersonRequestDTO);

        return new ResponseEntity<>(
                new StandardResponse(200, "Person Created", personIdResponseDTO),
                HttpStatus.OK
        );
    }
}
