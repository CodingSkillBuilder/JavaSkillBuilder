package com.cruiser.secureDemo.security.service;

import com.cruiser.secureDemo.Common.mappers.UserMapper;
import com.cruiser.secureDemo.dto.request.UserCreationRequestDto;
import com.cruiser.secureDemo.entity.Users;
import com.cruiser.secureDemo.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    // we are using this to create the hash that we can save to the database.
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public Users register(UserCreationRequestDto userCreationRequestDto){

        Users user = UserMapper.userCreationRequestDtoToUsersMapper(userCreationRequestDto);


        //Mapping the object
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        return usersRepository.save(user);
    }
}
