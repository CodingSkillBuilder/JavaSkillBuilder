package com.cruiser.demoOne.repo;


import com.cruiser.demoOne.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//this is the layer that gets connected to the data layer...(we never do any of the connection handling bare hands)


public interface UserRepo extends JpaRepository<User, Integer> {//this  diamond operator will have the name of the entity class that we plan to manipulate as well as the data type used for it's primary key...
//"JpaRepository is the class that we use to so the data base queries...as we know we auto mate them all..."
    //all point of making this interface is to give those classes in the dependencies access to the code that we write...
    //we can use methods to find users in this method...

//Ex
//    public User findById
}
//so mind that we have to make these sort of interfaces per every entity we make