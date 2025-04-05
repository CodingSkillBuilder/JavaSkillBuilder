package com.cruiser.demoOne.service;

import com.cruiser.demoOne.DTO.RequestUserDto;
import com.cruiser.demoOne.DTO.ResponseUserDto;


//It is the best practice to create a interface at this layer first to make sure that all the user requests will be able to be managed in a consistent method.

public interface UserService {
    public void validateUser(RequestUserDto userData); //we use the DTO type because data comes using that classes...
    //so the method should be expecting data from that format...

    public ResponseUserDto findUser(int id);//Mind that this is very bad practise to do ...since we use these classes to
    // to deal with the service layer; it is important that we communicate with the layer with via a DTO
    //if not we have to directly call the method from controller to pass the int which will make them platform dependant
    //so a good suggestion would be to replace int with a new DTO like the "RequestUserIdDto"
}
