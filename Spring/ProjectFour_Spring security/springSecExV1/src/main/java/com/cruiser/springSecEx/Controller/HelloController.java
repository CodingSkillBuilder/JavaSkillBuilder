package com.cruiser.springSecEx.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServle){
        return "Welcome to my world";
    }

}
