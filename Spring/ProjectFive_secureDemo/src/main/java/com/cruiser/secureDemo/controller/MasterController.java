package com.cruiser.secureDemo.controller;


import com.cruiser.secureDemo.dto.request.UserCreationRequestDto;
import com.cruiser.secureDemo.entity.Users;
import com.cruiser.secureDemo.security.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MasterController {

    @Autowired
    UserService userService;

    @GetMapping
    public String tester(HttpServletRequest request){ // we can use the approach to track the object
        return "This is the tester here " + request.getSession().getId(); // Viewing the session id.
    }

    @GetMapping("/home")
    public String getHome(){
        return "this is home page";
    }

    @GetMapping("/dashboard")
    public String getDashBoard(){
        return "this is dashboard page";
    }

    @GetMapping("/manage")
    public String getManagePage(){
        return "this is manage page";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login token here";
    }

    public Users register(@RequestBody UserCreationRequestDto userCreationRequestDto){



        return null;
    }
}
