package com.cruiser.demoOne.controller;

import com.cruiser.demoOne.DTO.RequestUserDto;
import com.cruiser.demoOne.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//so mind that many of the names that we give for our classes just
//@RequiredArgsConstructor
@RestController // we use this annotation that came with the web dependency to tell spring that this is a Controller that deals with REST APIs
@RequestMapping("/api/v1/user") //Kind of used to define the general path variable (all user related res / req will come through  this... get id / post password ect)
//in other words we say java to app request come through this link to this controller class.
public class UserController {

    @Autowired //links the controller with the relevant class in the service layer.
    private UserService theService;

    @PostMapping(value = "/submitUser") //This will ensure that the user mapping is in post requests that comes with from the following end point will end up here.
    public ResponseEntity<Object> userData(@RequestBody RequestUserDto requestUserDto){
        // in the @RequestBody we show where to look within the API call for the data that is structured...(in this case in the format of "RequestUerDto")
        //Since we are using this format spring would also be intelligent enough to make the send errors if the api was not structured well enough
//        System.out.println(requestUserDto.toString());
        theService.validateUser(requestUserDto);

        return null;
    }
}
