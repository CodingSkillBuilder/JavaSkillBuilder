package com.cruiser.secureDemo.Common.mappers;

import com.cruiser.secureDemo.dto.request.UserCreationRequestDto;
import com.cruiser.secureDemo.entity.Users;

public class UserMapper {



    public static Users userCreationRequestDtoToUsersMapper(UserCreationRequestDto userCreationRequestDto){
        return Users.builder()
                .username(userCreationRequestDto.getUsername())
                .password(userCreationRequestDto.getPassword())
                .role(userCreationRequestDto.getRole())
                .build();
    }
}
