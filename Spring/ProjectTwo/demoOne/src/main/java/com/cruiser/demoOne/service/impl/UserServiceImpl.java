package com.cruiser.demoOne.service.impl;

import com.cruiser.demoOne.DTO.RequestUserDto;
import com.cruiser.demoOne.DTO.ResponseUserDto;
import com.cruiser.demoOne.entity.User;
import com.cruiser.demoOne.repo.UserRepo;
import com.cruiser.demoOne.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service//we have to use this annotation to let spring know that this class is a part of the service later.
public class UserServiceImpl implements UserService {
    @Autowired //Kind of use this annotations almost always when you wanna build connection between layers...
    private UserRepo repo;


    @Override
    public void validateUser(RequestUserDto userData) {
        System.out.println(userData.toString());
        User user = new User(userData.getId(), userData.getUsername(), userData.getPassword());
        repo.save(user);
    }

    @Override
    public ResponseUserDto findUser(int id) {
        return null;
    }
}
